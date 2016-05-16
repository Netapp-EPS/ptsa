package com.netapp.support_encyclopedia.dao;

import java.util.List;
import java.math.*;

import com.netapp.support_encyclopedia.model.Module;

public interface ModuleDAO {
	public List<Module> getModule(BigInteger versionId);
	public Module getModuleById(String id);
	

}
