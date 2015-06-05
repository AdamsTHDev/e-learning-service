package com.adms.elearning.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.elearning.entity.Answer;

public interface AnswerService {

	public List<Answer> findAll() throws Exception;

	public Answer add(Answer example, String userLogin) throws Exception;

	public Answer update(Answer example, String userLogin) throws Exception;

	public List<Answer> find(Answer example) throws Exception;

	public List<Answer> findByHql(String hql, Object...vals) throws Exception;

	public List<Answer> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<Answer> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

}
