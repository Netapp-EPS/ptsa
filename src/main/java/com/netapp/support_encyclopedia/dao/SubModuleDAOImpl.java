package com.netapp.support_encyclopedia.dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.netapp.support_encyclopedia.model.SubModule;
@Repository("subModuleDAO")
public class SubModuleDAOImpl extends AbstractDao implements SubModuleDAO {

	@SuppressWarnings("unchecked")
	public List<SubModule> getSubModule(BigInteger moduleId) {

		Criteria criteria=getSession().createCriteria(SubModule.class);
		criteria.add(Restrictions.eq("module_ID", moduleId));
		return criteria.list();
		}

	@Override
	public SubModule getSubModuleById(String id) {
		
		Criteria criteria=getSession().createCriteria(SubModule.class);
		criteria.add(Restrictions.eqOrIsNull("id", id));
		return (SubModule)criteria.list().get(0);}

}
