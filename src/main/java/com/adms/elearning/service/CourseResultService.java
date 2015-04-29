package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.CourseResult;

public interface CourseResultService {

	public List<CourseResult> findAll() throws Exception;

	public CourseResult add(CourseResult entity, String userLogin) throws Exception;

	public CourseResult update(CourseResult entity, String userLogin) throws Exception;

	public List<CourseResult> find(CourseResult example) throws Exception;

	public List<CourseResult> findByHql(String hql, Object...vals) throws Exception;

	public List<CourseResult> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
