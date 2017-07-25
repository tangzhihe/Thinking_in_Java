package log4jdemo;

import org.apache.log4j.Logger;

public class Log4jDemo {
	public static void main(String[] args){
		Logger logger = Logger.getLogger(log4jdemo.Log4jDemo.class);
		logger.debug("debug");
		logger.info("info");
		logger.error("error");
	}
}
