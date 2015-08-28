package com.sd.app.bean.reportdata;

// Generated Nov 22, 2014 1:17:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Rg23aistockId generated by hbm2java
 */
public class Rg23aistockId implements java.io.Serializable {

	private String coCode;
	private Float thick;
	private String icode;
	private String particulars;
	private Double sqMs;
	private Date sdate;

	public Rg23aistockId() {
	}

	public Rg23aistockId(String coCode, Float thick, String icode, String particulars, Double sqMs, Date sdate) {
		this.coCode = coCode;
		this.thick = thick;
		this.icode = icode;
		this.particulars = particulars;
		this.sqMs = sqMs;
		this.sdate = sdate;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
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

	public String getParticulars() {
		return this.particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public Double getSqMs() {
		return this.sqMs;
	}

	public void setSqMs(Double sqMs) {
		this.sqMs = sqMs;
	}

	public Date getSdate() {
		return this.sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Rg23aistockId))
			return false;
		Rg23aistockId castOther = (Rg23aistockId) other;

		return ((this.getCoCode() == castOther.getCoCode()) || (this.getCoCode() != null && castOther.getCoCode() != null && this.getCoCode().equals(
				castOther.getCoCode())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getParticulars() == castOther.getParticulars()) || (this.getParticulars() != null && castOther.getParticulars() != null && this
						.getParticulars().equals(castOther.getParticulars())))
				&& ((this.getSqMs() == castOther.getSqMs()) || (this.getSqMs() != null && castOther.getSqMs() != null && this.getSqMs().equals(
						castOther.getSqMs())))
				&& ((this.getSdate() == castOther.getSdate()) || (this.getSdate() != null && castOther.getSdate() != null && this.getSdate().equals(
						castOther.getSdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCoCode() == null ? 0 : this.getCoCode().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getParticulars() == null ? 0 : this.getParticulars().hashCode());
		result = 37 * result + (getSqMs() == null ? 0 : this.getSqMs().hashCode());
		result = 37 * result + (getSdate() == null ? 0 : this.getSdate().hashCode());
		return result;
	}

}