package com.adms.elearning.service;

import java.util.List;

import com.adms.elearning.entity.ClassRoom;

public interface ClassRoomService {

	public List<ClassRoom> findAll() throws Exception;

	public ClassRoom add(ClassRoom classRoom, String userLogin) throws Exception;

	public ClassRoom update(ClassRoom classRoom, String userLogin) throws Exception;

	public List<ClassRoom> find(ClassRoom example) throws Exception;

	public List<ClassRoom> findByHql(String hql, Object...vals) throws Exception;

	public List<ClassRoom> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

}
