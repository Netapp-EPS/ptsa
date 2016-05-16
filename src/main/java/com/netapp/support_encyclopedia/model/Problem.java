package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the problems database table.
 * 
 */
@Entity
@Table(name="problems")
public class Problem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Lob
	private String additional_Data_Collection;

	@Lob
	private String burt_Numbers;

	@Lob
	private String case_Numbers;

	@Column(nullable=false, length=100)
	private String DOT_Details;

	@Lob
	private String environment_Details;

	@Lob
	@Column(nullable=false)
	private String log_Message;

	@Column(nullable=false)
	private BigInteger module_ID;

	@Column(name="PRODUCT_ID", nullable=false)
	private BigInteger productId;

	private BigInteger rating;

	private BigInteger sub_Module_ID;

	@Column(nullable=false, length=200)
	private String submitter;

	@Lob
	@Column(nullable=false)
	private String title;

	@Lob
	@Column(nullable=false)
	private String troubleshooting_Steps;

	public Problem() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdditional_Data_Collection() {
		return this.additional_Data_Collection;
	}

	public void setAdditional_Data_Collection(String additional_Data_Collection) {
		this.additional_Data_Collection = additional_Data_Collection;
	}

	public String getBurt_Numbers() {
		return this.burt_Numbers;
	}

	public void setBurt_Numbers(String burt_Numbers) {
		this.burt_Numbers = burt_Numbers;
	}

	public String getCase_Numbers() {
		return this.case_Numbers;
	}

	public void setCase_Numbers(String case_Numbers) {
		this.case_Numbers = case_Numbers;
	}

	public String getDOT_Details() {
		return this.DOT_Details;
	}

	public void setDOT_Details(String DOT_Details) {
		this.DOT_Details = DOT_Details;
	}

	public String getEnvironment_Details() {
		return this.environment_Details;
	}

	public void setEnvironment_Details(String environment_Details) {
		this.environment_Details = environment_Details;
	}

	public String getLog_Message() {
		return this.log_Message;
	}

	public void setLog_Message(String log_Message) {
		this.log_Message = log_Message;
	}

	public BigInteger getModule_ID() {
		return this.module_ID;
	}

	public void setModule_ID(BigInteger module_ID) {
		this.module_ID = module_ID;
	}

	public BigInteger getProductId() {
		return this.productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

	public BigInteger getRating() {
		return this.rating;
	}

	public void setRating(BigInteger rating) {
		this.rating = rating;
	}

	public BigInteger getSub_Module_ID() {
		return this.sub_Module_ID;
	}

	public void setSub_Module_ID(BigInteger sub_Module_ID) {
		this.sub_Module_ID = sub_Module_ID;
	}

	public String getSubmitter() {
		return this.submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTroubleshooting_Steps() {
		return this.troubleshooting_Steps;
	}

	public void setTroubleshooting_Steps(String troubleshooting_Steps) {
		this.troubleshooting_Steps = troubleshooting_Steps;
	}

}