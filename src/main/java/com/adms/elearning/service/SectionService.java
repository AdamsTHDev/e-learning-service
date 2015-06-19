package com.adms.elearning.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.elearning.entity.Section;

public interface SectionService {

	public List<Section> findAll() throws Exception;

	public Section add(Section entity, String userLogin) throws Exception;

	public Section update(Section entity, String userLogin) throws Exception;

	public List<Section> find(Section example) throws Exception;

	public List<Section> findByHql(String hql, Object...vals) throws Exception;

	public List<Section> findByNamedQuery(String namedQuery, Object...vals) throws Exception;

	public List<Section> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;

	public Section findById(Long id) throws Exception;

}
