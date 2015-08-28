package com.sd.app.bean.reportdata;

// Generated Nov 22, 2014 1:17:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PrintGatePassId generated by hbm2java
 */
public class PrintGatePassId implements java.io.Serializable {

	private String coCode;
	private Integer gpNo;
	private Date date;
	private String party;
	private String orderNo;
	private String partyName;
	private String particulars;
	private String uom;
	private Integer qty;
	private Integer pkgs;
	private String packing;
	private String docType;
	private Integer docNo;
	private String remarks;
	private Boolean glass;
	private Boolean sale;
	private String title;
	private String time;

	public PrintGatePassId() {
	}

	public PrintGatePassId(String coCode, Integer gpNo, Date date, String party, String orderNo, String partyName, String particulars, String uom,
			Integer qty, Integer pkgs, String packing, String docType, Integer docNo, String remarks, Boolean glass, Boolean sale, String title,
			String time) {
		this.coCode = coCode;
		this.gpNo = gpNo;
		this.date = date;
		this.party = party;
		this.orderNo = orderNo;
		this.partyName = partyName;
		this.particulars = particulars;
		this.uom = uom;
		this.qty = qty;
		this.pkgs = pkgs;
		this.packing = packing;
		this.docType = docType;
		this.docNo = docNo;
		this.remarks = remarks;
		this.glass = glass;
		this.sale = sale;
		this.title = title;
		this.time = time;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public Integer getGpNo() {
		return this.gpNo;
	}

	public void setGpNo(Integer gpNo) {
		this.gpNo = gpNo;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getParty() {
		return this.party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getParticulars() {
		return this.particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public String getUom() {
		return this.uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getPkgs() {
		return this.pkgs;
	}

	public void setPkgs(Integer pkgs) {
		this.pkgs = pkgs;
	}

	public String getPacking() {
		return this.packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public Integer getDocNo() {
		return this.docNo;
	}

	public void setDocNo(Integer docNo) {
		this.docNo = docNo;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Boolean getGlass() {
		return this.glass;
	}

	public void setGlass(Boolean glass) {
		this.glass = glass;
	}

	public Boolean getSale() {
		return this.sale;
	}

	public void setSale(Boolean sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrintGatePassId))
			return false;
		PrintGatePassId castOther = (PrintGatePassId) other;

		return ((this.getCoCode() == castOther.getCoCode()) || (this.getCoCode() != null && castOther.getCoCode() != null && this.getCoCode().equals(
				castOther.getCoCode())))
				&& ((this.getGpNo() == castOther.getGpNo()) || (this.getGpNo() != null && castOther.getGpNo() != null && this.getGpNo().equals(
						castOther.getGpNo())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null && this.getDate().equals(
						castOther.getDate())))
				&& ((this.getParty() == castOther.getParty()) || (this.getParty() != null && castOther.getParty() != null && this.getParty().equals(
						castOther.getParty())))
				&& ((this.getOrderNo() == castOther.getOrderNo()) || (this.getOrderNo() != null && castOther.getOrderNo() != null && this
						.getOrderNo().equals(castOther.getOrderNo())))
				&& ((this.getPartyName() == castOther.getPartyName()) || (this.getPartyName() != null && castOther.getPartyName() != null && this
						.getPartyName().equals(castOther.getPartyName())))
				&& ((this.getParticulars() == castOther.getParticulars()) || (this.getParticulars() != null && castOther.getParticulars() != null && this
						.getParticulars().equals(castOther.getParticulars())))
				&& ((this.getUom() == castOther.getUom()) || (this.getUom() != null && castOther.getUom() != null && this.getUom().equals(
						castOther.getUom())))
				&& ((this.getQty() == castOther.getQty()) || (this.getQty() != null && castOther.getQty() != null && this.getQty().equals(
						castOther.getQty())))
				&& ((this.getPkgs() == castOther.getPkgs()) || (this.getPkgs() != null && castOther.getPkgs() != null && this.getPkgs().equals(
						castOther.getPkgs())))
				&& ((this.getPacking() == castOther.getPacking()) || (this.getPacking() != null && castOther.getPacking() != null && this
						.getPacking().equals(castOther.getPacking())))
				&& ((this.getDocType() == castOther.getDocType()) || (this.getDocType() != null && castOther.getDocType() != null && this
						.getDocType().equals(castOther.getDocType())))
				&& ((this.getDocNo() == castOther.getDocNo()) || (this.getDocNo() != null && castOther.getDocNo() != null && this.getDocNo().equals(
						castOther.getDocNo())))
				&& ((this.getRemarks() == castOther.getRemarks()) || (this.getRemarks() != null && castOther.getRemarks() != null && this
						.getRemarks().equals(castOther.getRemarks())))
				&& ((this.getGlass() == castOther.getGlass()) || (this.getGlass() != null && castOther.getGlass() != null && this.getGlass().equals(
						castOther.getGlass())))
				&& ((this.getSale() == castOther.getSale()) || (this.getSale() != null && castOther.getSale() != null && this.getSale().equals(
						castOther.getSale())))
				&& ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null && castOther.getTitle() != null && this.getTitle().equals(
						castOther.getTitle())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null && this.getTime().equals(
						castOther.getTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCoCode() == null ? 0 : this.getCoCode().hashCode());
		result = 37 * result + (getGpNo() == null ? 0 : this.getGpNo().hashCode());
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getParty() == null ? 0 : this.getParty().hashCode());
		result = 37 * result + (getOrderNo() == null ? 0 : this.getOrderNo().hashCode());
		result = 37 * result + (getPartyName() == null ? 0 : this.getPartyName().hashCode());
		result = 37 * result + (getParticulars() == null ? 0 : this.getParticulars().hashCode());
		result = 37 * result + (getUom() == null ? 0 : this.getUom().hashCode());
		result = 37 * result + (getQty() == null ? 0 : this.getQty().hashCode());
		result = 37 * result + (getPkgs() == null ? 0 : this.getPkgs().hashCode());
		result = 37 * result + (getPacking() == null ? 0 : this.getPacking().hashCode());
		result = 37 * result + (getDocType() == null ? 0 : this.getDocType().hashCode());
		result = 37 * result + (getDocNo() == null ? 0 : this.getDocNo().hashCode());
		result = 37 * result + (getRemarks() == null ? 0 : this.getRemarks().hashCode());
		result = 37 * result + (getGlass() == null ? 0 : this.getGlass().hashCode());
		result = 37 * result + (getSale() == null ? 0 : this.getSale().hashCode());
		result = 37 * result + (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		return result;
	}

}