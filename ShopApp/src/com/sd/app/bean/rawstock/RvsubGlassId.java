package com.sd.app.bean.rawstock;

// Generated Nov 22, 2014 1:16:28 PM by Hibernate Tools 3.4.0.CR1

/**
 * RvsubGlassId generated by hbm2java
 */
public class RvsubGlassId implements java.io.Serializable {

	private Integer rvSubIdNo;
	private String coCode;
	private Short rvNo;
	private Short poNo;
	private Integer poIdNo;
	private String icode;
	private Float thick;
	private Short width;
	private Short height;
	private Short crates;
	private Short billSheets;
	private Short short_;
	private Short breakage;
	private Short damage;
	private Short sheets;
	private Float sqMt;
	private Float rate;
	private Float amount;
	private String remarks;
	private Float excAmt;
	private Float actRate;
	private Float billRate;
	private Float discAmt;

	public RvsubGlassId() {
	}

	public RvsubGlassId(Integer rvSubIdNo, String coCode, Short rvNo, Short poNo, Integer poIdNo, String icode, Float thick, Short width,
			Short height, Short crates, Short billSheets, Short short_, Short breakage, Short damage, Short sheets, Float sqMt, Float rate,
			Float amount, String remarks, Float excAmt, Float actRate, Float billRate, Float discAmt) {
		this.rvSubIdNo = rvSubIdNo;
		this.coCode = coCode;
		this.rvNo = rvNo;
		this.poNo = poNo;
		this.poIdNo = poIdNo;
		this.icode = icode;
		this.thick = thick;
		this.width = width;
		this.height = height;
		this.crates = crates;
		this.billSheets = billSheets;
		this.short_ = short_;
		this.breakage = breakage;
		this.damage = damage;
		this.sheets = sheets;
		this.sqMt = sqMt;
		this.rate = rate;
		this.amount = amount;
		this.remarks = remarks;
		this.excAmt = excAmt;
		this.actRate = actRate;
		this.billRate = billRate;
		this.discAmt = discAmt;
	}

	public Integer getRvSubIdNo() {
		return this.rvSubIdNo;
	}

	public void setRvSubIdNo(Integer rvSubIdNo) {
		this.rvSubIdNo = rvSubIdNo;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public Short getRvNo() {
		return this.rvNo;
	}

	public void setRvNo(Short rvNo) {
		this.rvNo = rvNo;
	}

	public Short getPoNo() {
		return this.poNo;
	}

	public void setPoNo(Short poNo) {
		this.poNo = poNo;
	}

	public Integer getPoIdNo() {
		return this.poIdNo;
	}

	public void setPoIdNo(Integer poIdNo) {
		this.poIdNo = poIdNo;
	}

	public String getIcode() {
		return this.icode;
	}

	public void setIcode(String icode) {
		this.icode = icode;
	}

	public Float getThick() {
		return this.thick;
	}

	public void setThick(Float thick) {
		this.thick = thick;
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

	public Short getCrates() {
		return this.crates;
	}

	public void setCrates(Short crates) {
		this.crates = crates;
	}

	public Short getBillSheets() {
		return this.billSheets;
	}

	public void setBillSheets(Short billSheets) {
		this.billSheets = billSheets;
	}

	public Short getShort_() {
		return this.short_;
	}

	public void setShort_(Short short_) {
		this.short_ = short_;
	}

	public Short getBreakage() {
		return this.breakage;
	}

	public void setBreakage(Short breakage) {
		this.breakage = breakage;
	}

	public Short getDamage() {
		return this.damage;
	}

	public void setDamage(Short damage) {
		this.damage = damage;
	}

	public Short getSheets() {
		return this.sheets;
	}

	public void setSheets(Short sheets) {
		this.sheets = sheets;
	}

	public Float getSqMt() {
		return this.sqMt;
	}

	public void setSqMt(Float sqMt) {
		this.sqMt = sqMt;
	}

	public Float getRate() {
		return this.rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Float getExcAmt() {
		return this.excAmt;
	}

	public void setExcAmt(Float excAmt) {
		this.excAmt = excAmt;
	}

	public Float getActRate() {
		return this.actRate;
	}

	public void setActRate(Float actRate) {
		this.actRate = actRate;
	}

	public Float getBillRate() {
		return this.billRate;
	}

	public void setBillRate(Float billRate) {
		this.billRate = billRate;
	}

	public Float getDiscAmt() {
		return this.discAmt;
	}

	public void setDiscAmt(Float discAmt) {
		this.discAmt = discAmt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RvsubGlassId))
			return false;
		RvsubGlassId castOther = (RvsubGlassId) other;

		return ((this.getRvSubIdNo() == castOther.getRvSubIdNo()) || (this.getRvSubIdNo() != null && castOther.getRvSubIdNo() != null && this
				.getRvSubIdNo().equals(castOther.getRvSubIdNo())))
				&& ((this.getCoCode() == castOther.getCoCode()) || (this.getCoCode() != null && castOther.getCoCode() != null && this.getCoCode()
						.equals(castOther.getCoCode())))
				&& ((this.getRvNo() == castOther.getRvNo()) || (this.getRvNo() != null && castOther.getRvNo() != null && this.getRvNo().equals(
						castOther.getRvNo())))
				&& ((this.getPoNo() == castOther.getPoNo()) || (this.getPoNo() != null && castOther.getPoNo() != null && this.getPoNo().equals(
						castOther.getPoNo())))
				&& ((this.getPoIdNo() == castOther.getPoIdNo()) || (this.getPoIdNo() != null && castOther.getPoIdNo() != null && this.getPoIdNo()
						.equals(castOther.getPoIdNo())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getWidth() == castOther.getWidth()) || (this.getWidth() != null && castOther.getWidth() != null && this.getWidth().equals(
						castOther.getWidth())))
				&& ((this.getHeight() == castOther.getHeight()) || (this.getHeight() != null && castOther.getHeight() != null && this.getHeight()
						.equals(castOther.getHeight())))
				&& ((this.getCrates() == castOther.getCrates()) || (this.getCrates() != null && castOther.getCrates() != null && this.getCrates()
						.equals(castOther.getCrates())))
				&& ((this.getBillSheets() == castOther.getBillSheets()) || (this.getBillSheets() != null && castOther.getBillSheets() != null && this
						.getBillSheets().equals(castOther.getBillSheets())))
				&& ((this.getShort_() == castOther.getShort_()) || (this.getShort_() != null && castOther.getShort_() != null && this.getShort_()
						.equals(castOther.getShort_())))
				&& ((this.getBreakage() == castOther.getBreakage()) || (this.getBreakage() != null && castOther.getBreakage() != null && this
						.getBreakage().equals(castOther.getBreakage())))
				&& ((this.getDamage() == castOther.getDamage()) || (this.getDamage() != null && castOther.getDamage() != null && this.getDamage()
						.equals(castOther.getDamage())))
				&& ((this.getSheets() == castOther.getSheets()) || (this.getSheets() != null && castOther.getSheets() != null && this.getSheets()
						.equals(castOther.getSheets())))
				&& ((this.getSqMt() == castOther.getSqMt()) || (this.getSqMt() != null && castOther.getSqMt() != null && this.getSqMt().equals(
						castOther.getSqMt())))
				&& ((this.getRate() == castOther.getRate()) || (this.getRate() != null && castOther.getRate() != null && this.getRate().equals(
						castOther.getRate())))
				&& ((this.getAmount() == castOther.getAmount()) || (this.getAmount() != null && castOther.getAmount() != null && this.getAmount()
						.equals(castOther.getAmount())))
				&& ((this.getRemarks() == castOther.getRemarks()) || (this.getRemarks() != null && castOther.getRemarks() != null && this
						.getRemarks().equals(castOther.getRemarks())))
				&& ((this.getExcAmt() == castOther.getExcAmt()) || (this.getExcAmt() != null && castOther.getExcAmt() != null && this.getExcAmt()
						.equals(castOther.getExcAmt())))
				&& ((this.getActRate() == castOther.getActRate()) || (this.getActRate() != null && castOther.getActRate() != null && this
						.getActRate().equals(castOther.getActRate())))
				&& ((this.getBillRate() == castOther.getBillRate()) || (this.getBillRate() != null && castOther.getBillRate() != null && this
						.getBillRate().equals(castOther.getBillRate())))
				&& ((this.getDiscAmt() == castOther.getDiscAmt()) || (this.getDiscAmt() != null && castOther.getDiscAmt() != null && this
						.getDiscAmt().equals(castOther.getDiscAmt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRvSubIdNo() == null ? 0 : this.getRvSubIdNo().hashCode());
		result = 37 * result + (getCoCode() == null ? 0 : this.getCoCode().hashCode());
		result = 37 * result + (getRvNo() == null ? 0 : this.getRvNo().hashCode());
		result = 37 * result + (getPoNo() == null ? 0 : this.getPoNo().hashCode());
		result = 37 * result + (getPoIdNo() == null ? 0 : this.getPoIdNo().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getWidth() == null ? 0 : this.getWidth().hashCode());
		result = 37 * result + (getHeight() == null ? 0 : this.getHeight().hashCode());
		result = 37 * result + (getCrates() == null ? 0 : this.getCrates().hashCode());
		result = 37 * result + (getBillSheets() == null ? 0 : this.getBillSheets().hashCode());
		result = 37 * result + (getShort_() == null ? 0 : this.getShort_().hashCode());
		result = 37 * result + (getBreakage() == null ? 0 : this.getBreakage().hashCode());
		result = 37 * result + (getDamage() == null ? 0 : this.getDamage().hashCode());
		result = 37 * result + (getSheets() == null ? 0 : this.getSheets().hashCode());
		result = 37 * result + (getSqMt() == null ? 0 : this.getSqMt().hashCode());
		result = 37 * result + (getRate() == null ? 0 : this.getRate().hashCode());
		result = 37 * result + (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result + (getRemarks() == null ? 0 : this.getRemarks().hashCode());
		result = 37 * result + (getExcAmt() == null ? 0 : this.getExcAmt().hashCode());
		result = 37 * result + (getActRate() == null ? 0 : this.getActRate().hashCode());
		result = 37 * result + (getBillRate() == null ? 0 : this.getBillRate().hashCode());
		result = 37 * result + (getDiscAmt() == null ? 0 : this.getDiscAmt().hashCode());
		return result;
	}

}
