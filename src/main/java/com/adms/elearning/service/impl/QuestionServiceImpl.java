package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.QuestionDao;
import com.adms.elearning.entity.Question;
import com.adms.elearning.service.QuestionService;

@Service("questionService")
@Transactional
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionDao questionDao;
	
	public QuestionServiceImpl() {
		
	}

	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	
	@Override
	public List<Question> findAll() throws Exception {
		return questionDao.findAll();
	}

	@Override
	public Question add(Question example, String userLogin) throws Exception {
		return questionDao.save(example);
	}
	
	@Override
	public Question update(Question example, String userLogin) throws Exception {
		return questionDao.save(example);
	}
	
	@Override
	public List<Question> find(Question example) throws Exception {
		return questionDao.find(example);
	}
	
	@Override
	public List<Question> findByHql(String hql, Object...vals) throws Exception {
		return questionDao.findByHQL(hql, vals);
	}

	@Override
	public List<Question> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return questionDao.findByNamedQuery(namedQuery, vals);
	}
	
}
