package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.StudentDao;
import com.adms.elearning.entity.Student;
import com.adms.elearning.service.StudentService;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	public List<Student> findAll() throws Exception {
		return studentDao.findAll();
	}

	@Override
	public Student add(Student example, String userLogin) throws Exception {
		return studentDao.save(example);
	}
	
	@Override
	public Student update(Student example, String userLogin) throws Exception {
		return studentDao.save(example);
	}
	
	@Override
	public List<Student> find(Student example) throws Exception {
		return studentDao.find(example);
	}
	
	@Override
	public List<Student> findByHql(String hql, Object...vals) throws Exception {
		return studentDao.findByHQL(hql, vals);
	}

	@Override
	public List<Student> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return studentDao.findByNamedQuery(namedQuery, vals);
	}
	
}
