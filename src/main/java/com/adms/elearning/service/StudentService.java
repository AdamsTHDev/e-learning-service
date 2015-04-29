package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.Student;

public interface StudentService {

	public List<Student> findAll() throws Exception;

	public Student add(Student entity, String userLogin) throws Exception;

	public Student update(Student entity, String userLogin) throws Exception;

	public List<Student> find(Student example) throws Exception;

	public List<Student> findByHql(String hql, Object...vals) throws Exception;

	public List<Student> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
