package com.sd.app.bean.rawstock;

// Generated Nov 22, 2014 1:16:28 PM by Hibernate Tools 3.4.0.CR1

/**
 * OffCutReceiptsId generated by hbm2java
 */
public class OffCutReceiptsId implements java.io.Serializable {

	private String coCode;
	private Float receiptNo;
	private Integer optNo;
	private Float thick;
	private String icode;
	private Short width;
	private Short height;
	private Short sheets;
	private Float sqMt;
	private String remarks;

	public OffCutReceiptsId() {
	}

	public OffCutReceiptsId(String coCode, Float receiptNo, Integer optNo, Float thick, String icode, Short width, Short height, Short sheets,
			Float sqMt, String remarks) {
		this.coCode = coCode;
		this.receiptNo = receiptNo;
		this.optNo = optNo;
		this.thick = thick;
		this.icode = icode;
		this.width = width;
		this.height = height;
		this.sheets = sheets;
		this.sqMt = sqMt;
		this.remarks = remarks;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public Float getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(Float receiptNo) {
		this.receiptNo = receiptNo;
	}

	public Integer getOptNo() {
		return this.optNo;
	}

	public void setOptNo(Integer optNo) {
		this.optNo = optNo;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OffCutReceiptsId))
			return false;
		OffCutReceiptsId castOther = (OffCutReceiptsId) other;

		return ((this.getCoCode() == castOther.getCoCode()) || (this.getCoCode() != null && castOther.getCoCode() != null && this.getCoCode().equals(
				castOther.getCoCode())))
				&& ((this.getReceiptNo() == castOther.getReceiptNo()) || (this.getReceiptNo() != null && castOther.getReceiptNo() != null && this
						.getReceiptNo().equals(castOther.getReceiptNo())))
				&& ((this.getOptNo() == castOther.getOptNo()) || (this.getOptNo() != null && castOther.getOptNo() != null && this.getOptNo().equals(
						castOther.getOptNo())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getWidth() == castOther.getWidth()) || (this.getWidth() != null && castOther.getWidth() != null && this.getWidth().equals(
						castOther.getWidth())))
				&& ((this.getHeight() == castOther.getHeight()) || (this.getHeight() != null && castOther.getHeight() != null && this.getHeight()
						.equals(castOther.getHeight())))
				&& ((this.getSheets() == castOther.getSheets()) || (this.getSheets() != null && castOther.getSheets() != null && this.getSheets()
						.equals(castOther.getSheets())))
				&& ((this.getSqMt() == castOther.getSqMt()) || (this.getSqMt() != null && castOther.getSqMt() != null && this.getSqMt().equals(
						castOther.getSqMt())))
				&& ((this.getRemarks() == castOther.getRemarks()) || (this.getRemarks() != null && castOther.getRemarks() != null && this
						.getRemarks().equals(castOther.getRemarks())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCoCode() == null ? 0 : this.getCoCode().hashCode());
		result = 37 * result + (getReceiptNo() == null ? 0 : this.getReceiptNo().hashCode());
		result = 37 * result + (getOptNo() == null ? 0 : this.getOptNo().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getWidth() == null ? 0 : this.getWidth().hashCode());
		result = 37 * result + (getHeight() == null ? 0 : this.getHeight().hashCode());
		result = 37 * result + (getSheets() == null ? 0 : this.getSheets().hashCode());
		result = 37 * result + (getSqMt() == null ? 0 : this.getSqMt().hashCode());
		result = 37 * result + (getRemarks() == null ? 0 : this.getRemarks().hashCode());
		return result;
	}

}