/**
 * 宝龙电商
 * com.plocc.imgproc.listener
 * ImageProcessImpl.java
 * <p/>
 * 2013-7-29-下午4:47:25
 * 2013宝龙公司-版权所有
 */
package com.plocc.kafka.support.async.impl;

import com.plocc.kafka.support.ConfigHelper;
import com.plocc.kafka.support.async.AsyncExecuteService;
import com.plocc.kafka.support.async.exception.AsyncExecuteServiceException;
import com.plocc.kafka.support.async.task.AsyncTask;

import java.util.Properties;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class AsyncExecuteServiceImpl implements AsyncExecuteService {

    private ThreadPoolExecutor threadPoolExecutor;

    private int corePoolSize;
    private int maximumPoolSize;
    private int keepAliveTime; // 当超过核心池数量时，工作线程无任务的等待时间，单位S
    private int workQueueSize;
    private RejectedExecutionHandler rejectHandler;


    public AsyncExecuteServiceImpl() {
        Properties config = ConfigHelper.getConsumerThreadsProperties();
        this.corePoolSize = Integer.parseInt(config.getProperty("aes_core_pool_size", String.valueOf(Runtime.getRuntime().availableProcessors())));
        this.maximumPoolSize = Integer.parseInt(config.getProperty("aes_max_pool_size", String.valueOf(Runtime.getRuntime().availableProcessors() * 2)));
        this.keepAliveTime = Integer.parseInt(config.getProperty("aes_keep_alive_time", String.valueOf(60 * 5)));
        this.workQueueSize = Integer.parseInt(config.getProperty("aes_work_queue_size", String.valueOf(10000)));
    }


    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public void setKeepAliveTime(int keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public void setWorkQueueSize(int workQueueSize) {
        this.workQueueSize = workQueueSize;
    }

    public void setRejectHandler(RejectedExecutionHandler rejectHandler) {
        this.rejectHandler = rejectHandler;
    }

    public <V> Future<V> submitTask(AsyncTask<V> asyncTask) {
        return threadPoolExecutor.submit(asyncTask);
    }


    public void stop() {
        threadPoolExecutor.shutdown();
    }

    public void start() {
        if (corePoolSize <= 0 || maximumPoolSize <= 0 || keepAliveTime <= 0 || workQueueSize <= 0) {
            throw new AsyncExecuteServiceException("AsyncExecuteService初始化失败，参数corePoolSize、maximumPoolSize、keepAliveTime、workQueueSize需大于0");
        }

        maximumPoolSize = Math.max(corePoolSize, maximumPoolSize);

        if (rejectHandler == null) {
            rejectHandler = new ThreadPoolExecutor.CallerRunsPolicy();
        }

        threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(workQueueSize), rejectHandler);

    }


    public int getWorkerSize() {
        return threadPoolExecutor.getActiveCount();
    }

    public int getWaitTaskSize() {
        return threadPoolExecutor.getQueue().size();
    }


    public long getCompletedTaskCount() {
        return threadPoolExecutor.getCompletedTaskCount();
    }

    public boolean isRunning() {
        return null != threadPoolExecutor && !threadPoolExecutor.isShutdown();
    }

}
