package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data_collection database table.
 * 
 */
@Entity
@Table(name="data_collection")
public class DataCollection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(length=200)
	private String name;

	@Column(name="PRODUCT_ID", nullable=false)
	private java.math.BigInteger productId;

	@Lob
	@Column(nullable=false)
	private String steps;

	public DataCollection() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.math.BigInteger getProductId() {
		return this.productId;
	}

	public void setProductId(java.math.BigInteger productId) {
		this.productId = productId;
	}

	public String getSteps() {
		return this.steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

}