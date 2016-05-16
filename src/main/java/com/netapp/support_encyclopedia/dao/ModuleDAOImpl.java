package com.netapp.support_encyclopedia.dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.netapp.support_encyclopedia.model.Module;

@Repository("moduleDAO")
public class ModuleDAOImpl extends AbstractDao implements ModuleDAO{
@SuppressWarnings("unchecked")
	public List<Module> getModule(BigInteger versionId) {

	Criteria criteria=getSession().createCriteria(Module.class);
	criteria.add(Restrictions.eq("versionId", versionId));
	return criteria.list();
	}

@Override
public Module getModuleById(String id) {
	// TODO Auto-generated method stub
	Criteria criteria=getSession().createCriteria(Module.class);
	criteria.add(Restrictions.eqOrIsNull("id", id));
	return (Module)criteria.list().get(0);
}



}
