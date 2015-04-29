package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.AnswerType;

public interface AnswerTypeService {

	public List<AnswerType> findAll() throws Exception;

	public AnswerType add(AnswerType example, String userLogin) throws Exception;

	public AnswerType update(AnswerType example, String userLogin) throws Exception;

	public List<AnswerType> find(AnswerType example) throws Exception;

	public List<AnswerType> findByHql(String hql, Object...vals) throws Exception;

	public List<AnswerType> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
