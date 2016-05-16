package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the performance_problems database table.
 * 
 */
@Entity
@Table(name="performance_problems")
public class PerformanceProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Lob
	@Column(nullable=false)
	private String configuration;

	@Lob
	private String host_Configuration;

	public PerformanceProblem() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getHost_Configuration() {
		return this.host_Configuration;
	}

	public void setHost_Configuration(String host_Configuration) {
		this.host_Configuration = host_Configuration;
	}

}