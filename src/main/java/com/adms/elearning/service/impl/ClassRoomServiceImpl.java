package com.adms.elearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.ClassRoomDao;
import com.adms.elearning.entity.ClassRoom;
import com.adms.elearning.service.ClassRoomService;

@Service("classRoomService")
@Transactional
public class ClassRoomServiceImpl implements ClassRoomService {

	@Autowired
	private ClassRoomDao classRoomDao;
	
	public ClassRoomServiceImpl() {
		
	}

	public void setClassRoomDao(ClassRoomDao classRoomDao) {
		this.classRoomDao = classRoomDao;
	}
	
	@Override
	public ClassRoom save(ClassRoom example, String userLogin) throws Exception {
		List<ClassRoom> classRooms = find(example);
		if(classRooms != null && classRooms.size() == 1) {
			return update(example, userLogin);
		} else if(classRooms == null) {
			return add(example, userLogin);
		} else if(classRooms.size() > 1) {
			throw new Exception("Found Class Room more than 1: " + example.toString());
		}
		return null;
	}
	
	@Override
	public List<ClassRoom> findAll() throws Exception {
		return classRoomDao.findAll();
	}

	@Override
	public ClassRoom add(ClassRoom example, String userLogin) throws Exception {
		return classRoomDao.save(example);
	}
	
	@Override
	public ClassRoom update(ClassRoom example, String userLogin) throws Exception {
		return classRoomDao.save(example);
	}
	
	@Override
	public List<ClassRoom> find(ClassRoom example) throws Exception {
		return classRoomDao.find(example);
	}
	
	@Override
	public List<ClassRoom> findByHql(String hql, Object...vals) throws Exception {
		return classRoomDao.findByHQL(hql, vals);
	}

	@Override
	public List<ClassRoom> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return classRoomDao.findByNamedQuery(namedQuery, vals);
	}
	
}
