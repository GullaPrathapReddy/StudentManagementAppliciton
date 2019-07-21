package com.stu.hostels.service;

import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stu.hostels.dao.StudentManagementDAO;
import com.stu.hostels.domain.Student;
import com.stu.hostels.dto.StudentDTO;
import com.stu.hostels.utility.LoggingUtility;


@Service
public class StudentManagementServiceImpl implements StudentManagementService {

		@Autowired
		private StudentManagementDAO dao;
		private Logger logger;
		
		public StudentManagementServiceImpl() {
				logger=LoggingUtility.getLoggerInstance();
		}
	@Override
	public String GetstudentPrimaryDetails(StudentDTO dto) {
		Student stu=null;
		stu=new Student();
		BeanUtils.copyProperties(dto, stu);
		if(stu.getName()!=null) {
			logger.info("No and Name"+stu.getSno()+"---"+dto.getName()+"--"+dto.getD_o_b());
			dao.save(stu);
			return "Success";
		}else {
			return "";
		}
		/*BeanUtils.copyProperties(dto, stu);
		dao.save(stu);*/
	}

}
