package com.netapp.support_encyclopedia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the problem_comments database table.
 * 
 */
@Entity
@Table(name="problem_comments")
public class ProblemComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Lob
	private String comments;

	@Temporal(TemporalType.DATE)
	private Date date_of_submission;

	@Column(nullable=false)
	private java.math.BigInteger problem_ID;

	@Column(nullable=false, length=100)
	private String state;

	@Column(nullable=false, length=200)
	private String submitter;

	public ProblemComment() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDate_of_submission() {
		return this.date_of_submission;
	}

	public void setDate_of_submission(Date date_of_submission) {
		this.date_of_submission = date_of_submission;
	}

	public java.math.BigInteger getProblem_ID() {
		return this.problem_ID;
	}

	public void setProblem_ID(java.math.BigInteger problem_ID) {
		this.problem_ID = problem_ID;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSubmitter() {
		return this.submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

}