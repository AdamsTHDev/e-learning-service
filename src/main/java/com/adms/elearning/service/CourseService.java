package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.Course;

public interface CourseService {

	public List<Course> findAll() throws Exception;

	public Course add(Course entity, String userLogin) throws Exception;

	public Course update(Course entity, String userLogin) throws Exception;

	public List<Course> find(Course example) throws Exception;

	public List<Course> findByHql(String hql, Object...vals) throws Exception;

	public List<Course> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public Course findById(Long id) throws Exception;

}
