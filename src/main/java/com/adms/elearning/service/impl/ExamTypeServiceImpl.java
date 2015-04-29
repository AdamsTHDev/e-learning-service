package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.ExamTypeDao;
import com.adms.elearning.entity.ExamType;
import com.adms.elearning.service.ExamTypeService;

@Service("examTypeService")
@Transactional
public class ExamTypeServiceImpl implements ExamTypeService {

	@Autowired
	private ExamTypeDao examTypeDao;
	
	public ExamTypeServiceImpl() {
		
	}

	public void setExamTypeDao(ExamTypeDao examTypeDao) {
		this.examTypeDao = examTypeDao;
	}
	
	@Override
	public List<ExamType> findAll() throws Exception {
		return examTypeDao.findAll();
	}

	@Override
	public ExamType add(ExamType example, String userLogin) throws Exception {
		return examTypeDao.save(example);
	}
	
	@Override
	public ExamType update(ExamType example, String userLogin) throws Exception {
		return examTypeDao.save(example);
	}
	
	@Override
	public List<ExamType> find(ExamType example) throws Exception {
		return examTypeDao.find(example);
	}
	
	@Override
	public List<ExamType> findByHql(String hql, Object...vals) throws Exception {
		return examTypeDao.findByHQL(hql, vals);
	}

	@Override
	public List<ExamType> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return examTypeDao.findByNamedQuery(namedQuery, vals);
	}
	
}
