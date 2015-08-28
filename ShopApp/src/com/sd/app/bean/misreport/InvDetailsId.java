package com.sd.app.bean.misreport;

// Generated Nov 22, 2014 1:06:28 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * InvDetailsId generated by hbm2java
 */
public class InvDetailsId implements java.io.Serializable {

	private String orderNo;
	private Float thick;
	private String icode;
	private String tough;
	private Date invDate;
	private Float pcs;

	public InvDetailsId() {
	}

	public InvDetailsId(String orderNo, Float thick, String icode, String tough, Date invDate, Float pcs) {
		this.orderNo = orderNo;
		this.thick = thick;
		this.icode = icode;
		this.tough = tough;
		this.invDate = invDate;
		this.pcs = pcs;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Float getThick() {
		return this.thick;
	}

	public void setThick(Float thick) {
		this.thick = thick;
	}

	public String getIcode() {
		return this.icode;
	}

	public void setIcode(String icode) {
		this.icode = icode;
	}

	public String getTough() {
		return this.tough;
	}

	public void setTough(String tough) {
		this.tough = tough;
	}

	public Date getInvDate() {
		return this.invDate;
	}

	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}

	public Float getPcs() {
		return this.pcs;
	}

	public void setPcs(Float pcs) {
		this.pcs = pcs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InvDetailsId))
			return false;
		InvDetailsId castOther = (InvDetailsId) other;

		return ((this.getOrderNo() == castOther.getOrderNo()) || (this.getOrderNo() != null && castOther.getOrderNo() != null && this.getOrderNo()
				.equals(castOther.getOrderNo())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getTough() == castOther.getTough()) || (this.getTough() != null && castOther.getTough() != null && this.getTough().equals(
						castOther.getTough())))
				&& ((this.getInvDate() == castOther.getInvDate()) || (this.getInvDate() != null && castOther.getInvDate() != null && this
						.getInvDate().equals(castOther.getInvDate())))
				&& ((this.getPcs() == castOther.getPcs()) || (this.getPcs() != null && castOther.getPcs() != null && this.getPcs().equals(
						castOther.getPcs())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOrderNo() == null ? 0 : this.getOrderNo().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getTough() == null ? 0 : this.getTough().hashCode());
		result = 37 * result + (getInvDate() == null ? 0 : this.getInvDate().hashCode());
		result = 37 * result + (getPcs() == null ? 0 : this.getPcs().hashCode());
		return result;
	}

}