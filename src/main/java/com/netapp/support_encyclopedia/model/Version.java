package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the version database table.
 * 
 */
@Entity
@Table(name="version")
public class Version implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(length=200)
	private String name;

	@Column(nullable=false, length=200)
	private String number;

	@Column(name="PRODUCT_ID", nullable=false)
	private java.math.BigInteger productId;

	@Temporal(TemporalType.DATE)
	private Date release_Date;

	public Version() {
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

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public java.math.BigInteger getProductId() {
		return this.productId;
	}

	public void setProductId(java.math.BigInteger productId) {
		this.productId = productId;
	}

	public Date getRelease_Date() {
		return this.release_Date;
	}

	public void setRelease_Date(Date release_Date) {
		this.release_Date = release_Date;
	}

}