package com.netapp.support_encyclopedia.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
@JsonIgnoreType(value=true)
public class ProblemDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2276868200535274201L;

	private String additional_Data_Collection;
	private String burt_Numbers;
	private String case_Numbers;
	private String DOT_Details;
	private String environment_Details;
	private String log_Message;
	private long module_ID;
	private long productId;
	private long rating;
	private long sub_Module_ID;
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
	public long getModule_ID() {
		return module_ID;
	}
	public void setModule_ID(long module_ID) {
		this.module_ID = module_ID;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	public long getSub_Module_ID() {
		return sub_Module_ID;
	}
	public void setSub_Module_ID(long sub_Module_ID) {
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
	
}
