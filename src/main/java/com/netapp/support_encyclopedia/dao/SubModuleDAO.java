package com.netapp.support_encyclopedia.dao;

import java.math.BigInteger;
import java.util.List;

import com.netapp.support_encyclopedia.model.SubModule;

public interface SubModuleDAO {
	public List<SubModule> getSubModule(BigInteger moduleId);
	public SubModule getSubModuleById(String id);
}
