package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
@JsonIgnoreType(value=true)


public class ProblemViewModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5497717053927312992L;
	
	public ProblemViewModel(){
		
	}
	
	public ProblemViewModel(Problem problem) {
		this.problemId=Long.valueOf(problem.getId());
		this.additional_Data_Collection=problem.getAdditional_Data_Collection();
		this.burt_Numbers=problem.getBurt_Numbers();
		this.case_Numbers=problem.getCase_Numbers();
		this.DOT_Details=problem.getDOT_Details();
		this.environment_Details=problem.getEnvironment_Details();
		this.log_Message=problem.getLog_Message();
		this.module_ID=problem.getModule_ID();
		this.productId=problem.getProductId();
		this.sub_Module_ID=problem.getSub_Module_ID();
		this.rating=problem.getRating();
		this.title=problem.getTitle();
		this.troubleshooting_Steps=problem.getTroubleshooting_Steps();
		this.submitter=problem.getSubmitter();
		
	}
	private long problemId;
	private String additional_Data_Collection;
	private String burt_Numbers;
	private String case_Numbers;
	private String DOT_Details;
	private String environment_Details;
	private String log_Message;
	private BigInteger module_ID;
	private String moduleName;
	private BigInteger productId;
	private String productName;
	private BigInteger rating;
	private BigInteger sub_Module_ID;
	private String subModuleName;
	private String submitter;
	private String title;
	private String troubleshooting_Steps;
	public String getAdditional_Data_Collection() {
		return additional_Data_Collection;
	}
	public void setAdditional_Data_Collection(String additional_Data_Collection) {
		this.additional_Data_Collection = additional_Data_Collection;
	}
	public String getBurt_Numbers() {
		return burt_Numbers;
	}
	public void setBurt_Numbers(String burt_Numbers) {
		this.burt_Numbers = burt_Numbers;
	}
	public String getCase_Numbers() {
		return case_Numbers;
	}
	public void setCase_Numbers(String case_Numbers) {
		this.case_Numbers = case_Numbers;
	}
	public String getDOT_Details() {
		return DOT_Details;
	}
	public void setDOT_Details(String dOT_Details) {
		DOT_Details = dOT_Details;
	}
	public String getEnvironment_Details() {
		return environment_Details;
	}
	public void setEnvironment_Details(String environment_Details) {
		this.environment_Details = environment_Details;
	}
	public String getLog_Message() {
		return log_Message;
	}
	public void setLog_Message(String log_Message) {
		this.log_Message = log_Message;
	}
	public BigInteger getModule_ID() {
		return module_ID;
	}
	public void setModule_ID(BigInteger module_ID) {
		this.module_ID = module_ID;
	}
	public BigInteger getProductId() {
		return productId;
	}
	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}
	public BigInteger getRating() {
		return rating;
	}
	public void setRating(BigInteger rating) {
		this.rating = rating;
	}
	public BigInteger getSub_Module_ID() {
		return sub_Module_ID;
	}
	public void setSub_Module_ID(BigInteger sub_Module_ID) {
		this.sub_Module_ID = sub_Module_ID;
	}
	public String getSubmitter() {
		return submitter;
	}
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTroubleshooting_Steps() {
		return troubleshooting_Steps;
	}
	public void setTroubleshooting_Steps(String troubleshooting_Steps) {
		this.troubleshooting_Steps = troubleshooting_Steps;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSubModuleName() {
		return subModuleName;
	}
	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}
	public long getProblemId() {
		return problemId;
	}
	public void setProblemId(long problemId) {
		this.problemId = problemId;
	}
	
	
	
}
