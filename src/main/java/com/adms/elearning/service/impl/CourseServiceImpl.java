package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.CourseDao;
import com.adms.elearning.entity.Course;
import com.adms.elearning.service.CourseService;

@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	@Override
	public List<Course> findAll() throws Exception {
		return courseDao.findAll();
	}

	@Override
	public Course add(Course example, String userLogin) throws Exception {
		return courseDao.save(example);
	}
	
	@Override
	public Course update(Course example, String userLogin) throws Exception {
		return courseDao.save(example);
	}
	
	@Override
	public List<Course> find(Course example) throws Exception {
		return courseDao.find(example);
	}
	
	@Override
	public Course findById(Long id) throws Exception {
		return courseDao.find(id);
	}
	
	@Override
	public List<Course> findByHql(String hql, Object...vals) throws Exception {
		return courseDao.findByHQL(hql, vals);
	}

	@Override
	public List<Course> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return courseDao.findByNamedQuery(namedQuery, vals);
	}
	
}
