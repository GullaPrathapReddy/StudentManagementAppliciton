package com.stu.hostels.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingUtility {

	public static Logger getLoggerInstance() {
		return LoggerFactory.getLogger(LoggingUtility.class);
	}
}
