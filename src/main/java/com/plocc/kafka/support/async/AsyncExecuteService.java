/**
 * 宝龙电商
 * com.plocc.imgproc.listener
 * ImageProcessImpl.java
 * <p/>
 * 2013-7-29-下午4:47:25
 * 2013宝龙公司-版权所有
 */
package com.plocc.kafka.support.async;

import com.plocc.kafka.support.async.task.AsyncTask;

import java.util.concurrent.Future;

public interface AsyncExecuteService {
    /**
     * 提交异步任务
     *
     * @param asyncTask
     * @return 通过Future获取执行结果
     */
    public <V> Future<V> submitTask(AsyncTask<V> asyncTask);

    /**
     * 启动异步执行服务
     */
    public void start();

    /**
     * 关闭异步执行服务，停止接受新的任务
     */
    public void stop();

    /**
     * 获取工作线程数
     * @return
     */
    public int getWorkerSize();

    /**
     * 获取等待中的任务数
     * @return
     */
    public int getWaitTaskSize();

    /**
     * 获取已经完成的任务数
     * @return
     */
    public long getCompletedTaskCount();

    /**
     * 是否是运行状态
     * @return
     */
    public boolean isRunning();


}
