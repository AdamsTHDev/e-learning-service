package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.AnswerTypeDao;
import com.adms.elearning.entity.AnswerType;
import com.adms.elearning.service.AnswerTypeService;

@Service("answerTypeService")
@Transactional
public class AnswerTypeServiceImpl implements AnswerTypeService {

	@Autowired
	private AnswerTypeDao answerTypeDao;
	
	public AnswerTypeServiceImpl() {
		
	}

	public void setAnswerDao(AnswerTypeDao answerTypeDao) {
		this.answerTypeDao = answerTypeDao;
	}
	
	@Override
	public List<AnswerType> findAll() throws Exception {
		return answerTypeDao.findAll();
	}

	@Override
	public AnswerType add(AnswerType example, String userLogin) throws Exception {
		return answerTypeDao.save(example);
	}
	
	@Override
	public AnswerType update(AnswerType example, String userLogin) throws Exception {
		return answerTypeDao.save(example);
	}
	
	@Override
	public List<AnswerType> find(AnswerType example) throws Exception {
		return answerTypeDao.find(example);
	}
	
	@Override
	public List<AnswerType> findByHql(String hql, Object...vals) throws Exception {
		return answerTypeDao.findByHQL(hql, vals);
	}

	@Override
	public List<AnswerType> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return answerTypeDao.findByNamedQuery(namedQuery, vals);
	}
	
}
