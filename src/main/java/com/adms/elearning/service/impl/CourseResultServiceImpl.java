package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.CourseResultDao;
import com.adms.elearning.entity.CourseResult;
import com.adms.elearning.service.CourseResultService;

@Service("courseResultService")
@Transactional
public class CourseResultServiceImpl implements CourseResultService {

	@Autowired
	private CourseResultDao courseResultDao;
	
	public CourseResultServiceImpl() {
		
	}

	public void setCourseResultDao(CourseResultDao courseResultDao) {
		this.courseResultDao = courseResultDao;
	}
	
	@Override
	public List<CourseResult> findAll() throws Exception {
		return courseResultDao.findAll();
	}

	@Override
	public CourseResult add(CourseResult example, String userLogin) throws Exception {
		return courseResultDao.save(example);
	}
	
	@Override
	public CourseResult update(CourseResult example, String userLogin) throws Exception {
		return courseResultDao.save(example);
	}
	
	@Override
	public List<CourseResult> find(CourseResult example) throws Exception {
		return courseResultDao.find(example);
	}
	
	@Override
	public List<CourseResult> findByHql(String hql, Object...vals) throws Exception {
		return courseResultDao.findByHQL(hql, vals);
	}

	@Override
	public List<CourseResult> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return courseResultDao.findByNamedQuery(namedQuery, vals);
	}
	
}
