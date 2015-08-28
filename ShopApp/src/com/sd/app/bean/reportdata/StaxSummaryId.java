package com.sd.app.bean.reportdata;

// Generated Nov 22, 2014 1:17:36 PM by Hibernate Tools 3.4.0.CR1

/**
 * StaxSummaryId generated by hbm2java
 */
public class StaxSummaryId implements java.io.Serializable {

	private String staxForm;
	private Double staxBasic;
	private Float staxPer;
	private Double staxAmt;
	private Boolean sale;

	public StaxSummaryId() {
	}

	public StaxSummaryId(String staxForm, Double staxBasic, Float staxPer, Double staxAmt, Boolean sale) {
		this.staxForm = staxForm;
		this.staxBasic = staxBasic;
		this.staxPer = staxPer;
		this.staxAmt = staxAmt;
		this.sale = sale;
	}

	public String getStaxForm() {
		return this.staxForm;
	}

	public void setStaxForm(String staxForm) {
		this.staxForm = staxForm;
	}

	public Double getStaxBasic() {
		return this.staxBasic;
	}

	public void setStaxBasic(Double staxBasic) {
		this.staxBasic = staxBasic;
	}

	public Float getStaxPer() {
		return this.staxPer;
	}

	public void setStaxPer(Float staxPer) {
		this.staxPer = staxPer;
	}

	public Double getStaxAmt() {
		return this.staxAmt;
	}

	public void setStaxAmt(Double staxAmt) {
		this.staxAmt = staxAmt;
	}

	public Boolean getSale() {
		return this.sale;
	}

	public void setSale(Boolean sale) {
		this.sale = sale;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StaxSummaryId))
			return false;
		StaxSummaryId castOther = (StaxSummaryId) other;

		return ((this.getStaxForm() == castOther.getStaxForm()) || (this.getStaxForm() != null && castOther.getStaxForm() != null && this
				.getStaxForm().equals(castOther.getStaxForm())))
				&& ((this.getStaxBasic() == castOther.getStaxBasic()) || (this.getStaxBasic() != null && castOther.getStaxBasic() != null && this
						.getStaxBasic().equals(castOther.getStaxBasic())))
				&& ((this.getStaxPer() == castOther.getStaxPer()) || (this.getStaxPer() != null && castOther.getStaxPer() != null && this
						.getStaxPer().equals(castOther.getStaxPer())))
				&& ((this.getStaxAmt() == castOther.getStaxAmt()) || (this.getStaxAmt() != null && castOther.getStaxAmt() != null && this
						.getStaxAmt().equals(castOther.getStaxAmt())))
				&& ((this.getSale() == castOther.getSale()) || (this.getSale() != null && castOther.getSale() != null && this.getSale().equals(
						castOther.getSale())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStaxForm() == null ? 0 : this.getStaxForm().hashCode());
		result = 37 * result + (getStaxBasic() == null ? 0 : this.getStaxBasic().hashCode());
		result = 37 * result + (getStaxPer() == null ? 0 : this.getStaxPer().hashCode());
		result = 37 * result + (getStaxAmt() == null ? 0 : this.getStaxAmt().hashCode());
		result = 37 * result + (getSale() == null ? 0 : this.getSale().hashCode());
		return result;
	}

}
