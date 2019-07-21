package com.stu.hostels.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.stu.hostels.domain.Student;

@EnableJpaRepositories
public interface StudentManagementDAO extends JpaRepository<Student, String> {

}
