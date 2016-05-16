package com.netapp.support_encyclopedia.dao;

import java.util.List;

import com.netapp.support_encyclopedia.model.Version;

public interface VersionDAO {
	public List<Version> getVersions(java.math.BigInteger productID);
}
