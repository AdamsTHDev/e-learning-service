package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.Question;

public interface QuestionService {

	public List<Question> findAll() throws Exception;

	public Question add(Question entity, String userLogin) throws Exception;

	public Question update(Question entity, String userLogin) throws Exception;

	public List<Question> find(Question example) throws Exception;

	public List<Question> findByHql(String hql, Object...vals) throws Exception;

	public List<Question> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
