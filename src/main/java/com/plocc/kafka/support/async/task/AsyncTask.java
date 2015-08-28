/**
 * 宝龙电商
 * com.plocc.imgproc.listener
 * ImageProcessImpl.java
 * 
 * 2013-7-29-下午4:47:25
 *  2013宝龙公司-版权所有
 * 
 */
package com.plocc.kafka.support.async.task;

import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

public abstract class AsyncTask<V> implements Callable<V> {
	private static Logger logger = Logger.getLogger(AsyncTask.class);

	public V call() throws Exception {
		try {
			return doInAsync();
		} catch (Throwable e) {
			logger.error(e);
		}
		
		return null;
	}

	/**
	 * 由任务执行线程调用
	 * @return
	 */
	public abstract V doInAsync();
}
