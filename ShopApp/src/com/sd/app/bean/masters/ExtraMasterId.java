package com.sd.app.bean.masters;

// Generated Nov 22, 2014 1:22:06 PM by Hibernate Tools 3.4.0.CR1

/**
 * ExtraMasterId generated by hbm2java
 */
public class ExtraMasterId implements java.io.Serializable {

	private Integer idNo;
	private String master;
	private Integer code;
	private String strCode;
	private String name;
	private Short srNo;

	public ExtraMasterId() {
	}

	public ExtraMasterId(Integer idNo, String master, Integer code, String strCode, String name, Short srNo) {
		this.idNo = idNo;
		this.master = master;
		this.code = code;
		this.strCode = strCode;
		this.name = name;
		this.srNo = srNo;
	}

	public Integer getIdNo() {
		return this.idNo;
	}

	public void setIdNo(Integer idNo) {
		this.idNo = idNo;
	}

	public String getMaster() {
		return this.master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStrCode() {
		return this.strCode;
	}

	public void setStrCode(String strCode) {
		this.strCode = strCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getSrNo() {
		return this.srNo;
	}

	public void setSrNo(Short srNo) {
		this.srNo = srNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExtraMasterId))
			return false;
		ExtraMasterId castOther = (ExtraMasterId) other;

		return ((this.getIdNo() == castOther.getIdNo()) || (this.getIdNo() != null && castOther.getIdNo() != null && this.getIdNo().equals(
				castOther.getIdNo())))
				&& ((this.getMaster() == castOther.getMaster()) || (this.getMaster() != null && castOther.getMaster() != null && this.getMaster()
						.equals(castOther.getMaster())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null && castOther.getCode() != null && this.getCode().equals(
						castOther.getCode())))
				&& ((this.getStrCode() == castOther.getStrCode()) || (this.getStrCode() != null && castOther.getStrCode() != null && this
						.getStrCode().equals(castOther.getStrCode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null && this.getName().equals(
						castOther.getName())))
				&& ((this.getSrNo() == castOther.getSrNo()) || (this.getSrNo() != null && castOther.getSrNo() != null && this.getSrNo().equals(
						castOther.getSrNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdNo() == null ? 0 : this.getIdNo().hashCode());
		result = 37 * result + (getMaster() == null ? 0 : this.getMaster().hashCode());
		result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result + (getStrCode() == null ? 0 : this.getStrCode().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getSrNo() == null ? 0 : this.getSrNo().hashCode());
		return result;
	}

}
