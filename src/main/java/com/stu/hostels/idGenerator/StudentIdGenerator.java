package com.stu.hostels.idGenerator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;

import com.stu.hostels.utility.LoggingUtility;

public class StudentIdGenerator implements IdentifierGenerator {

	private Random random;
	private Logger logger;
	public StudentIdGenerator() {
			logger=LoggingUtility.getLoggerInstance();
			logger.info("StudentIDGenerator Is Created");
	}
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
		String id = null;
		int number = 0;
		random = new Random();
		number = random.nextInt(10000);
		id = "STU" + number;
		return id;
	}

}
