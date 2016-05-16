package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sub_module database table.
 * 
 */
@Entity
@Table(name="sub_module")
public class SubModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Lob
	private String description;

	@Column(nullable=false)
	private java.math.BigInteger module_ID;

	@Column(nullable=false, length=200)
	private String name;

	public SubModule() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.math.BigInteger getModule_ID() {
		return this.module_ID;
	}

	public void setModule_ID(java.math.BigInteger module_ID) {
		this.module_ID = module_ID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}