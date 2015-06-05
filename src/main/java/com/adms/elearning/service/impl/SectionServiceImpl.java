package com.adms.elearning.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.elearning.dao.SectionDao;
import com.adms.elearning.entity.Section;
import com.adms.elearning.service.SectionService;

@Service("sectionService")
@Transactional
public class SectionServiceImpl implements SectionService {

	@Autowired
	private SectionDao sectionDao;
	
	public SectionServiceImpl() {
		
	}

	public void setSectionDao(SectionDao sectionDao) {
		this.sectionDao = sectionDao;
	}
	
	@Override
	public List<Section> findAll() throws Exception {
		return sectionDao.findAll();
	}

	@Override
	public Section add(Section example, String userLogin) throws Exception {
		return sectionDao.save(example);
	}
	
	@Override
	public Section update(Section example, String userLogin) throws Exception {
		return sectionDao.save(example);
	}
	
	@Override
	public List<Section> find(Section example) throws Exception {
		return sectionDao.find(example);
	}
	
	@Override
	public List<Section> findByHql(String hql, Object...vals) throws Exception {
		return sectionDao.findByHQL(hql, vals);
	}

	@Override
	public List<Section> findByNamedQuery(String namedQuery, Object...vals) throws Exception {
		return sectionDao.findByNamedQuery(namedQuery, vals);
	}
	
	@Override
	public List<Section> findByCriteria(DetachedCriteria detachedCriteria) throws Exception {
		return sectionDao.findByCriteria(detachedCriteria);
	}
	
}
