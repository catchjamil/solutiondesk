package com.sd.app.bean.company;

// Generated Nov 22, 2014 12:49:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CompanyTablesId generated by hbm2java
 */
@Entity
@Table(name="CompanyTables")
public class CompanyTables implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6787007494678257517L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idNo;
	@Column
	private Float pcode;
	@Column
	private Short sno;
	@Column
	private String staxForm;
	@Column
	private String rtable;
	@Column
	private String stable;
	@Column
	private String exTable;
	@Column
	private Float discount;
	@Column
	private String remarks;
	@Column
	private String type;
	@Column
	private Float application;
	@Column
	private String regular;
	@Column
	private Date entryDate;

	public CompanyTables() {
	}


	public Integer getIdNo() {
		return this.idNo;
	}

	public void setIdNo(Integer idNo) {
		this.idNo = idNo;
	}

	public Float getPcode() {
		return this.pcode;
	}

	public void setPcode(Float pcode) {
		this.pcode = pcode;
	}

	public Short getSno() {
		return this.sno;
	}

	public void setSno(Short sno) {
		this.sno = sno;
	}

	public String getStaxForm() {
		return this.staxForm;
	}

	public void setStaxForm(String staxForm) {
		this.staxForm = staxForm;
	}

	public String getRtable() {
		return this.rtable;
	}

	public void setRtable(String rtable) {
		this.rtable = rtable;
	}

	public String getStable() {
		return this.stable;
	}

	public void setStable(String stable) {
		this.stable = stable;
	}

	public String getExTable() {
		return this.exTable;
	}

	public void setExTable(String exTable) {
		this.exTable = exTable;
	}

	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getApplication() {
		return this.application;
	}

	public void setApplication(Float application) {
		this.application = application;
	}

	public String getRegular() {
		return this.regular;
	}

	public void setRegular(String regular) {
		this.regular = regular;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}


}
