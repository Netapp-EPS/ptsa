package com.netapp.support_encyclopedia.dao;

import java.math.BigInteger;
import java.util.List;

import com.netapp.support_encyclopedia.model.ProblemDTO;
import com.netapp.support_encyclopedia.model.ProblemViewModel;

public interface ProblemDAO {
	
	public void saveOrUpdateProblem(ProblemDTO problem );
	
	public List<ProblemViewModel> getAllProblems();
	
	public List<ProblemViewModel> getAllProblemsBySymptom(String logMessage);
	
	public List<ProblemViewModel> getProductProblemsBySymptom(String logMessage,BigInteger productId);
	
	public List<ProblemViewModel> getProductModulesProblemsBySymptom(String logMessage,BigInteger productId,BigInteger moduleId);
	
	public List<ProblemViewModel> getProductSubmodulesProblemsBySymptom(String logMessage,BigInteger productId,BigInteger moduleId,BigInteger subModueId);

}
