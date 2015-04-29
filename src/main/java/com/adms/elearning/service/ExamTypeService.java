package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.ExamType;

public interface ExamTypeService {

	public List<ExamType> findAll() throws Exception;

	public ExamType add(ExamType entity, String userLogin) throws Exception;

	public ExamType update(ExamType entity, String userLogin) throws Exception;

	public List<ExamType> find(ExamType example) throws Exception;

	public List<ExamType> findByHql(String hql, Object...vals) throws Exception;

	public List<ExamType> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
