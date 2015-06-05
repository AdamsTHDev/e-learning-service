package com.adms.elearning.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.elearning.entity.CourseEnrolment;

public interface CourseEnrolmentService {

	public List<CourseEnrolment> findAll() throws Exception;

	public CourseEnrolment add(CourseEnrolment entity, String userLogin) throws Exception;

	public CourseEnrolment update(CourseEnrolment entity, String userLogin) throws Exception;

	public List<CourseEnrolment> find(CourseEnrolment example) throws Exception;

	public List<CourseEnrolment> findByHql(String hql, Object...vals) throws Exception;

	public List<CourseEnrolment> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<CourseEnrolment> findByCriteria(DetachedCriteria criteria) throws Exception;

}
