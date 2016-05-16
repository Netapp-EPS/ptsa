package com.netapp.support_encyclopedia.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.netapp.support_encyclopedia.model.Problem;
import com.netapp.support_encyclopedia.model.ProblemDTO;
import com.netapp.support_encyclopedia.model.ProblemViewModel;
@Repository("problemDAO")
public class ProblemDAOImpl extends AbstractDao implements ProblemDAO{
	@Autowired
	ProductDAO productDao;
	@Autowired
	ModuleDAO moduleDAO;
	@Autowired
	SubModuleDAO subModuleDAO;
	
	public void saveOrUpdateProblem(ProblemDTO problem) {
		Problem problemModel=new Problem();
		problemModel.setAdditional_Data_Collection(problem.getAdditional_Data_Collection());
		problemModel.setBurt_Numbers(problem.getBurt_Numbers());
		problemModel.setCase_Numbers(problem.getCase_Numbers());
		problemModel.setDOT_Details(problem.getDOT_Details());
		problemModel.setLog_Message(problem.getLog_Message());
		problemModel.setProductId(BigInteger.valueOf(problem.getProductId()));
		problemModel.setModule_ID(BigInteger.valueOf(problem.getModule_ID()));
		problemModel.setSub_Module_ID(BigInteger.valueOf(problem.getSub_Module_ID()));
		problemModel.setRating(BigInteger.valueOf(problem.getRating()));
		problemModel.setSubmitter(problem.getSubmitter());
		problemModel.setTitle(problem.getTitle());
		problemModel.setTroubleshooting_Steps(problem.getTroubleshooting_Steps());
		problemModel.setEnvironment_Details(problem.getEnvironment_Details());
		persist(problemModel);		
	}

	@SuppressWarnings("unchecked")
	public List<ProblemViewModel> getAllProblems() {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(Problem.class);
		return criteria.list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProblemViewModel> getAllProblemsBySymptom(String logMessage) {
		
		Criteria criteria=getSession().createCriteria(Problem.class);
		criteria.add(Restrictions.like("log_Message", logMessage, MatchMode.ANYWHERE));
		return convertProblemToProblemViewModel(criteria.list());
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProblemViewModel> getProductProblemsBySymptom(String logMessage,
			BigInteger productId) {
		Criteria criteria=getSession().createCriteria(Problem.class);
		criteria.add(Restrictions.eq("productId", productId));
		criteria.add(Restrictions.like("log_Message", logMessage, MatchMode.ANYWHERE));
		return convertProblemToProblemViewModel(criteria.list());
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProblemViewModel> getProductModulesProblemsBySymptom(String logMessage,
			BigInteger productId, BigInteger moduleId) {
		Criteria criteria=getSession().createCriteria(Problem.class);
		criteria.add(Restrictions.eq("productId", productId));
		criteria.add(Restrictions.eq("module_ID", moduleId));
		criteria.add(Restrictions.like("log_Message", logMessage, MatchMode.ANYWHERE));
		return convertProblemToProblemViewModel(criteria.list());
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ProblemViewModel> getProductSubmodulesProblemsBySymptom(
			String logMessage, BigInteger productId,BigInteger moduleId, BigInteger subModueId) {
		Criteria criteria=getSession().createCriteria(Problem.class);
		criteria.add(Restrictions.eq("sub_Module_ID", subModueId));
		criteria.add(Restrictions.eq("productId", productId));
		criteria.add(Restrictions.eq("module_ID", moduleId));
		criteria.add(Restrictions.like("log_Message", logMessage, MatchMode.ANYWHERE));
		return convertProblemToProblemViewModel(criteria.list());
	}
	
	public List<ProblemViewModel> convertProblemToProblemViewModel(List<Problem> problemList){
		List<ProblemViewModel> problemViewModelList=new ArrayList<ProblemViewModel>();
		if(problemList!=null){
			for(Problem tempProblem:problemList){
				ProblemViewModel problemViewModel=new ProblemViewModel(tempProblem);
				if(tempProblem.getProductId()!=null){
				problemViewModel.setProductName(productDao.getProductById(String.valueOf(tempProblem.getProductId().longValue())).getName());}
				if(tempProblem.getModule_ID()!=null){
				problemViewModel.setModuleName(moduleDAO.getModuleById(String.valueOf(tempProblem.getModule_ID().longValue())).getName());}
				if(tempProblem.getSub_Module_ID()!=null){
				problemViewModel.setSubModuleName(subModuleDAO.getSubModuleById(String.valueOf(tempProblem.getSub_Module_ID().longValue())).getName());}
				problemViewModelList.add(problemViewModel);
			}
		}
		return problemViewModelList;
	}


}
