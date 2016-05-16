package com.netapp.support_encyclopedia.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netapp.support_encyclopedia.dao.ProblemDAO;
import com.netapp.support_encyclopedia.model.ProblemDTO;
import com.netapp.support_encyclopedia.model.ProblemViewModel;

@RestController
@RequestMapping("/problem")
@Transactional
public class ProblemController {
	@Autowired
	ProblemDAO problemDAO;
	
	@RequestMapping(value="/addProblem",method=RequestMethod.POST)
	public void addProblem(@RequestBody ProblemDTO problem){
		System.out.println("Test");
//		ObjectMapper mapper=new ObjectMapper();
//		Problem problemModel=null;
//			try {
//				problemModel = mapper.readValue(problem,Problem.class);
//			} catch (JsonParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (JsonMappingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		problemDAO.saveOrUpdateProblem(problem);
		
		
	}
	@RequestMapping("/allProblems")
	public List<ProblemViewModel> getAllProblems(){
		return problemDAO.getAllProblems();
	}
	
	@RequestMapping(value ="/allProductProblemsBySymptom",produces="application/json",method=RequestMethod.POST)
	public List<ProblemViewModel> getAllProductProblemsBySymptom(@RequestParam("logMessage") String logMessage,@RequestParam("productId") String productId){
		return problemDAO.getProductProblemsBySymptom(logMessage,BigInteger.valueOf(Long.valueOf(productId)));
	}
	
	@RequestMapping(value ="/allProblemsBySymptom",produces="application/json",method=RequestMethod.POST)
	public List<ProblemViewModel> getAllProblemsBySymptom(@RequestParam("logMessage") String logMessage){
		return problemDAO.getAllProblemsBySymptom(logMessage);
	}
	
	@RequestMapping(value ="/allProductModulesProblemsBySymptom",produces="application/json",method=RequestMethod.POST,consumes={"text/plain", "application/*"})
	public List<ProblemViewModel> getAllProductModulesProblemsBySymptom(@RequestParam("logMessage") String logMessage,@RequestParam("productId") String productId,@RequestParam("moduleId") String moduleId){
		return problemDAO.getProductModulesProblemsBySymptom(logMessage,BigInteger.valueOf(Long.valueOf(productId)),BigInteger.valueOf(Long.valueOf(moduleId)));
	}
	
	@RequestMapping(value ="/allProductSubmodulesProblemsBySymptom",produces="application/json",method=RequestMethod.POST,consumes={"text/plain", "application/*"})
	public List<ProblemViewModel> getAllProductSubmodulesProblemsBySymptom(@RequestParam("logMessage") String logMessage,@RequestParam("productId") String productId,@RequestParam("moduleId") String moduleId,@RequestParam("subModuleId") String subModuleId){
		return problemDAO.getProductSubmodulesProblemsBySymptom(logMessage,BigInteger.valueOf(Long.valueOf(productId)),BigInteger.valueOf(Long.valueOf(moduleId)),BigInteger.valueOf(Long.valueOf(subModuleId)));
	}
	
	

}
