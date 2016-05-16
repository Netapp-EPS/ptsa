package com.netapp.support_encyclopedia.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.netapp.support_encyclopedia.model.Version;
@Repository("versionDAO")
public class VersionDAOImpl extends AbstractDao implements VersionDAO{

	@SuppressWarnings("unchecked")
	public List<Version> getVersions(java.math.BigInteger productID) {
		
		Criteria criteria=getSession().createCriteria(Version.class);
		criteria.add(Restrictions.eq("productId", productID));
		return criteria.list();
	}

}
