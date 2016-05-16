package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the module database table.
 * 
 */
@Entity
@Table(name="module")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Lob
	private String description;

	@Column(length=100)
	private String DOT_Support;

	@Column(nullable=false, length=200)
	private String name;

	@Column(name="VERSION_ID", nullable=false)
	private java.math.BigInteger versionId;

	public Module() {
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

	public String getDOT_Support() {
		return this.DOT_Support;
	}

	public void setDOT_Support(String DOT_Support) {
		this.DOT_Support = DOT_Support;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.math.BigInteger getVersionId() {
		return this.versionId;
	}

	public void setVersionId(java.math.BigInteger versionId) {
		this.versionId = versionId;
	}

}