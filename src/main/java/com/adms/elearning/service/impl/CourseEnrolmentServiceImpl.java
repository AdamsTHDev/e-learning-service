
package com.adms.elearning.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.CourseEnrolmentDao;
import com.adms.elearning.entity.CourseEnrolment;
import com.adms.elearning.service.CourseEnrolmentService;

@Service("courseEnrolmentService")
@Transactional
public class CourseEnrolmentServiceImpl implements CourseEnrolmentService {

	@Autowired
	private CourseEnrolmentDao courseEnrolmentDao;
	
	public CourseEnrolmentServiceImpl() {
		
	}

	public void setCourseEnrolmentDao(CourseEnrolmentDao courseEnrolmentDao) {
		this.courseEnrolmentDao = courseEnrolmentDao;
	}
	
	@Override
	public List<CourseEnrolment> findAll() throws Exception {
		return courseEnrolmentDao.findAll();
	}

	@Override
	public CourseEnrolment add(CourseEnrolment example, String userLogin) throws Exception {
		return courseEnrolmentDao.save(example);
	}
	
	@Override
	public CourseEnrolment update(CourseEnrolment example, String userLogin) throws Exception {
		return courseEnrolmentDao.save(example);
	}
	
	@Override
	public List<CourseEnrolment> find(CourseEnrolment example) throws Exception {
		return courseEnrolmentDao.find(example);
	}
	
	@Override
	public List<CourseEnrolment> findByHql(String hql, Object...vals) throws Exception {
		return courseEnrolmentDao.findByHQL(hql, vals);
	}

	@Override
	public List<CourseEnrolment> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return courseEnrolmentDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<CourseEnrolment> findByCriteria(DetachedCriteria criteria) throws Exception {
		return courseEnrolmentDao.findByCriteria(criteria);
	}
	
}
