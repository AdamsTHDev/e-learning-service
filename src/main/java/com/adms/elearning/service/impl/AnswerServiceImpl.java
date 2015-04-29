package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.AnswerDao;
import com.adms.elearning.entity.Answer;
import com.adms.elearning.service.AnswerService;

@Service("answerService")
@Transactional
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	private AnswerDao answerDao;
	
	public AnswerServiceImpl() {
		
	}

	public void setAnswerDao(AnswerDao answerDao) {
		this.answerDao = answerDao;
	}
	
	@Override
	public List<Answer> findAll() throws Exception {
		return answerDao.findAll();
	}

	@Override
	public Answer add(Answer example, String userLogin) throws Exception {
		return answerDao.save(example);
	}
	
	@Override
	public Answer update(Answer example, String userLogin) throws Exception {
		return answerDao.save(example);
	}
	
	@Override
	public List<Answer> find(Answer example) throws Exception {
		return answerDao.find(example);
	}
	
	@Override
	public List<Answer> findByHql(String hql, Object...vals) throws Exception {
		return answerDao.findByHQL(hql, vals);
	}

	@Override
	public List<Answer> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return answerDao.findByNamedQuery(namedQuery, vals);
	}
	
}
