package log4jdemo;

import org.apache.log4j.Logger;

public class Log4jDemo {
	public static void main(String[] args){
		Logger logger = Logger.getLogger(log4jdemo.Log4jDemo.class);
		logger.info("----------------------LOG4j info start--------------------------");
		logger.info("info");
		logger.info("----------------------LOG4j info end----------------------------");
		logger.info("----------------------LOG4j error start--------------------------");
		logger.info("error");
		logger.info("----------------------LOG4j error end----------------------------");
	}
}
