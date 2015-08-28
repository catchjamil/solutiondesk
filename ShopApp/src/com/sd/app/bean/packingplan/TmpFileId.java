package com.sd.app.bean.packingplan;

// Generated Nov 22, 2014 1:11:50 PM by Hibernate Tools 3.4.0.CR1

/**
 * TmpFileId generated by hbm2java
 */
public class TmpFileId implements java.io.Serializable {

	private Integer packNo;
	private Short crNo;
	private String orderNo;
	private Short itNo;
	private Float thick;
	private String icode;
	private String bend;
	private String tough;
	private Short width;
	private Short height;
	private Short taper;
	private Short pcs;
	private String particulars;
	private Short weight;

	public TmpFileId() {
	}

	public TmpFileId(Integer packNo, Short crNo, String orderNo, Short itNo, Float thick, String icode, String bend, String tough, Short width,
			Short height, Short taper, Short pcs, String particulars, Short weight) {
		this.packNo = packNo;
		this.crNo = crNo;
		this.orderNo = orderNo;
		this.itNo = itNo;
		this.thick = thick;
		this.icode = icode;
		this.bend = bend;
		this.tough = tough;
		this.width = width;
		this.height = height;
		this.taper = taper;
		this.pcs = pcs;
		this.particulars = particulars;
		this.weight = weight;
	}

	public Integer getPackNo() {
		return this.packNo;
	}

	public void setPackNo(Integer packNo) {
		this.packNo = packNo;
	}

	public Short getCrNo() {
		return this.crNo;
	}

	public void setCrNo(Short crNo) {
		this.crNo = crNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Short getItNo() {
		return this.itNo;
	}

	public void setItNo(Short itNo) {
		this.itNo = itNo;
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

	public String getBend() {
		return this.bend;
	}

	public void setBend(String bend) {
		this.bend = bend;
	}

	public String getTough() {
		return this.tough;
	}

	public void setTough(String tough) {
		this.tough = tough;
	}

	public Short getWidth() {
		return this.width;
	}

	public void setWidth(Short width) {
		this.width = width;
	}

	public Short getHeight() {
		return this.height;
	}

	public void setHeight(Short height) {
		this.height = height;
	}

	public Short getTaper() {
		return this.taper;
	}

	public void setTaper(Short taper) {
		this.taper = taper;
	}

	public Short getPcs() {
		return this.pcs;
	}

	public void setPcs(Short pcs) {
		this.pcs = pcs;
	}

	public String getParticulars() {
		return this.particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public Short getWeight() {
		return this.weight;
	}

	public void setWeight(Short weight) {
		this.weight = weight;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpFileId))
			return false;
		TmpFileId castOther = (TmpFileId) other;

		return ((this.getPackNo() == castOther.getPackNo()) || (this.getPackNo() != null && castOther.getPackNo() != null && this.getPackNo().equals(
				castOther.getPackNo())))
				&& ((this.getCrNo() == castOther.getCrNo()) || (this.getCrNo() != null && castOther.getCrNo() != null && this.getCrNo().equals(
						castOther.getCrNo())))
				&& ((this.getOrderNo() == castOther.getOrderNo()) || (this.getOrderNo() != null && castOther.getOrderNo() != null && this
						.getOrderNo().equals(castOther.getOrderNo())))
				&& ((this.getItNo() == castOther.getItNo()) || (this.getItNo() != null && castOther.getItNo() != null && this.getItNo().equals(
						castOther.getItNo())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getBend() == castOther.getBend()) || (this.getBend() != null && castOther.getBend() != null && this.getBend().equals(
						castOther.getBend())))
				&& ((this.getTough() == castOther.getTough()) || (this.getTough() != null && castOther.getTough() != null && this.getTough().equals(
						castOther.getTough())))
				&& ((this.getWidth() == castOther.getWidth()) || (this.getWidth() != null && castOther.getWidth() != null && this.getWidth().equals(
						castOther.getWidth())))
				&& ((this.getHeight() == castOther.getHeight()) || (this.getHeight() != null && castOther.getHeight() != null && this.getHeight()
						.equals(castOther.getHeight())))
				&& ((this.getTaper() == castOther.getTaper()) || (this.getTaper() != null && castOther.getTaper() != null && this.getTaper().equals(
						castOther.getTaper())))
				&& ((this.getPcs() == castOther.getPcs()) || (this.getPcs() != null && castOther.getPcs() != null && this.getPcs().equals(
						castOther.getPcs())))
				&& ((this.getParticulars() == castOther.getParticulars()) || (this.getParticulars() != null && castOther.getParticulars() != null && this
						.getParticulars().equals(castOther.getParticulars())))
				&& ((this.getWeight() == castOther.getWeight()) || (this.getWeight() != null && castOther.getWeight() != null && this.getWeight()
						.equals(castOther.getWeight())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPackNo() == null ? 0 : this.getPackNo().hashCode());
		result = 37 * result + (getCrNo() == null ? 0 : this.getCrNo().hashCode());
		result = 37 * result + (getOrderNo() == null ? 0 : this.getOrderNo().hashCode());
		result = 37 * result + (getItNo() == null ? 0 : this.getItNo().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getBend() == null ? 0 : this.getBend().hashCode());
		result = 37 * result + (getTough() == null ? 0 : this.getTough().hashCode());
		result = 37 * result + (getWidth() == null ? 0 : this.getWidth().hashCode());
		result = 37 * result + (getHeight() == null ? 0 : this.getHeight().hashCode());
		result = 37 * result + (getTaper() == null ? 0 : this.getTaper().hashCode());
		result = 37 * result + (getPcs() == null ? 0 : this.getPcs().hashCode());
		result = 37 * result + (getParticulars() == null ? 0 : this.getParticulars().hashCode());
		result = 37 * result + (getWeight() == null ? 0 : this.getWeight().hashCode());
		return result;
	}

}