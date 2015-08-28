package com.sd.app.bean.misreport1;

// Generated Nov 22, 2014 1:07:53 PM by Hibernate Tools 3.4.0.CR1

/**
 * PendingRatesId generated by hbm2java
 */
public class PendingRatesId implements java.io.Serializable {

	private Float thick;
	private String icode;
	private String tough;
	private String bend;
	private String material;

	public PendingRatesId() {
	}

	public PendingRatesId(Float thick, String icode, String tough, String bend, String material) {
		this.thick = thick;
		this.icode = icode;
		this.tough = tough;
		this.bend = bend;
		this.material = material;
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

	public String getBend() {
		return this.bend;
	}

	public void setBend(String bend) {
		this.bend = bend;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PendingRatesId))
			return false;
		PendingRatesId castOther = (PendingRatesId) other;

		return ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
				castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getTough() == castOther.getTough()) || (this.getTough() != null && castOther.getTough() != null && this.getTough().equals(
						castOther.getTough())))
				&& ((this.getBend() == castOther.getBend()) || (this.getBend() != null && castOther.getBend() != null && this.getBend().equals(
						castOther.getBend())))
				&& ((this.getMaterial() == castOther.getMaterial()) || (this.getMaterial() != null && castOther.getMaterial() != null && this
						.getMaterial().equals(castOther.getMaterial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getTough() == null ? 0 : this.getTough().hashCode());
		result = 37 * result + (getBend() == null ? 0 : this.getBend().hashCode());
		result = 37 * result + (getMaterial() == null ? 0 : this.getMaterial().hashCode());
		return result;
	}

}
