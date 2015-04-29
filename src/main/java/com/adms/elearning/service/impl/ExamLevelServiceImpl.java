package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.ExamLevelDao;
import com.adms.elearning.entity.ExamLevel;
import com.adms.elearning.service.ExamLevelService;

@Service("examLevelService")
@Transactional
public class ExamLevelServiceImpl implements ExamLevelService {

	@Autowired
	private ExamLevelDao examLevelDao;
	
	public ExamLevelServiceImpl() {
		
	}

	public void setExamLevelDao(ExamLevelDao examLevelDao) {
		this.examLevelDao = examLevelDao;
	}
	
	@Override
	public List<ExamLevel> findAll() throws Exception {
		return examLevelDao.findAll();
	}

	@Override
	public ExamLevel add(ExamLevel example, String userLogin) throws Exception {
		return examLevelDao.save(example);
	}
	
	@Override
	public ExamLevel update(ExamLevel example, String userLogin) throws Exception {
		return examLevelDao.save(example);
	}
	
	@Override
	public List<ExamLevel> find(ExamLevel example) throws Exception {
		return examLevelDao.find(example);
	}
	
	@Override
	public List<ExamLevel> findByHql(String hql, Object...vals) throws Exception {
		return examLevelDao.findByHQL(hql, vals);
	}

	@Override
	public List<ExamLevel> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return examLevelDao.findByNamedQuery(namedQuery, vals);
	}
	
}
