package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.ExamLevel;

public interface ExamLevelService {

	public List<ExamLevel> findAll() throws Exception;

	public ExamLevel add(ExamLevel entity, String userLogin) throws Exception;

	public ExamLevel update(ExamLevel entity, String userLogin) throws Exception;

	public List<ExamLevel> find(ExamLevel example) throws Exception;

	public List<ExamLevel> findByHql(String hql, Object...vals) throws Exception;

	public List<ExamLevel> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
