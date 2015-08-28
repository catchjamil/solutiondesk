package com.sd.app.bean.lamproduction;

// Generated Nov 22, 2014 1:02:55 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ReportToughId generated by hbm2java
 */
public class ReportToughId implements java.io.Serializable {

	private Date date;
	private String orderNo;
	private String party;
	private Float thick;
	private Float pcs;
	private Float sqMs;
	private String remarks;
	private Short breakage;
	private Float breakSqMt;
	private String reportType;
	private String reportId;
	private Double monthProd;
	private Double monthBreakage;
	private Double monthNet;
	private Double monthDiesel;
	private Float monthHrs;
	private Float monthNonProdHrs;
	private String grinding;
	private Float rmtbreakage;
	private Float prodrmt;
	private Short machineCode;
	private String machineName;
	private String shift;
	private String cutType;
	private Boolean reWork;
	private String material;

	public ReportToughId() {
	}

	public ReportToughId(Date date, String orderNo, String party, Float thick, Float pcs, Float sqMs, String remarks, Short breakage,
			Float breakSqMt, String reportType, String reportId, Double monthProd, Double monthBreakage, Double monthNet, Double monthDiesel,
			Float monthHrs, Float monthNonProdHrs, String grinding, Float rmtbreakage, Float prodrmt, Short machineCode, String machineName,
			String shift, String cutType, Boolean reWork, String material) {
		this.date = date;
		this.orderNo = orderNo;
		this.party = party;
		this.thick = thick;
		this.pcs = pcs;
		this.sqMs = sqMs;
		this.remarks = remarks;
		this.breakage = breakage;
		this.breakSqMt = breakSqMt;
		this.reportType = reportType;
		this.reportId = reportId;
		this.monthProd = monthProd;
		this.monthBreakage = monthBreakage;
		this.monthNet = monthNet;
		this.monthDiesel = monthDiesel;
		this.monthHrs = monthHrs;
		this.monthNonProdHrs = monthNonProdHrs;
		this.grinding = grinding;
		this.rmtbreakage = rmtbreakage;
		this.prodrmt = prodrmt;
		this.machineCode = machineCode;
		this.machineName = machineName;
		this.shift = shift;
		this.cutType = cutType;
		this.reWork = reWork;
		this.material = material;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getParty() {
		return this.party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public Float getThick() {
		return this.thick;
	}

	public void setThick(Float thick) {
		this.thick = thick;
	}

	public Float getPcs() {
		return this.pcs;
	}

	public void setPcs(Float pcs) {
		this.pcs = pcs;
	}

	public Float getSqMs() {
		return this.sqMs;
	}

	public void setSqMs(Float sqMs) {
		this.sqMs = sqMs;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Short getBreakage() {
		return this.breakage;
	}

	public void setBreakage(Short breakage) {
		this.breakage = breakage;
	}

	public Float getBreakSqMt() {
		return this.breakSqMt;
	}

	public void setBreakSqMt(Float breakSqMt) {
		this.breakSqMt = breakSqMt;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public Double getMonthProd() {
		return this.monthProd;
	}

	public void setMonthProd(Double monthProd) {
		this.monthProd = monthProd;
	}

	public Double getMonthBreakage() {
		return this.monthBreakage;
	}

	public void setMonthBreakage(Double monthBreakage) {
		this.monthBreakage = monthBreakage;
	}

	public Double getMonthNet() {
		return this.monthNet;
	}

	public void setMonthNet(Double monthNet) {
		this.monthNet = monthNet;
	}

	public Double getMonthDiesel() {
		return this.monthDiesel;
	}

	public void setMonthDiesel(Double monthDiesel) {
		this.monthDiesel = monthDiesel;
	}

	public Float getMonthHrs() {
		return this.monthHrs;
	}

	public void setMonthHrs(Float monthHrs) {
		this.monthHrs = monthHrs;
	}

	public Float getMonthNonProdHrs() {
		return this.monthNonProdHrs;
	}

	public void setMonthNonProdHrs(Float monthNonProdHrs) {
		this.monthNonProdHrs = monthNonProdHrs;
	}

	public String getGrinding() {
		return this.grinding;
	}

	public void setGrinding(String grinding) {
		this.grinding = grinding;
	}

	public Float getRmtbreakage() {
		return this.rmtbreakage;
	}

	public void setRmtbreakage(Float rmtbreakage) {
		this.rmtbreakage = rmtbreakage;
	}

	public Float getProdrmt() {
		return this.prodrmt;
	}

	public void setProdrmt(Float prodrmt) {
		this.prodrmt = prodrmt;
	}

	public Short getMachineCode() {
		return this.machineCode;
	}

	public void setMachineCode(Short machineCode) {
		this.machineCode = machineCode;
	}

	public String getMachineName() {
		return this.machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getShift() {
		return this.shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getCutType() {
		return this.cutType;
	}

	public void setCutType(String cutType) {
		this.cutType = cutType;
	}

	public Boolean getReWork() {
		return this.reWork;
	}

	public void setReWork(Boolean reWork) {
		this.reWork = reWork;
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
		if (!(other instanceof ReportToughId))
			return false;
		ReportToughId castOther = (ReportToughId) other;

		return ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null && this.getDate().equals(
				castOther.getDate())))
				&& ((this.getOrderNo() == castOther.getOrderNo()) || (this.getOrderNo() != null && castOther.getOrderNo() != null && this
						.getOrderNo().equals(castOther.getOrderNo())))
				&& ((this.getParty() == castOther.getParty()) || (this.getParty() != null && castOther.getParty() != null && this.getParty().equals(
						castOther.getParty())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getPcs() == castOther.getPcs()) || (this.getPcs() != null && castOther.getPcs() != null && this.getPcs().equals(
						castOther.getPcs())))
				&& ((this.getSqMs() == castOther.getSqMs()) || (this.getSqMs() != null && castOther.getSqMs() != null && this.getSqMs().equals(
						castOther.getSqMs())))
				&& ((this.getRemarks() == castOther.getRemarks()) || (this.getRemarks() != null && castOther.getRemarks() != null && this
						.getRemarks().equals(castOther.getRemarks())))
				&& ((this.getBreakage() == castOther.getBreakage()) || (this.getBreakage() != null && castOther.getBreakage() != null && this
						.getBreakage().equals(castOther.getBreakage())))
				&& ((this.getBreakSqMt() == castOther.getBreakSqMt()) || (this.getBreakSqMt() != null && castOther.getBreakSqMt() != null && this
						.getBreakSqMt().equals(castOther.getBreakSqMt())))
				&& ((this.getReportType() == castOther.getReportType()) || (this.getReportType() != null && castOther.getReportType() != null && this
						.getReportType().equals(castOther.getReportType())))
				&& ((this.getReportId() == castOther.getReportId()) || (this.getReportId() != null && castOther.getReportId() != null && this
						.getReportId().equals(castOther.getReportId())))
				&& ((this.getMonthProd() == castOther.getMonthProd()) || (this.getMonthProd() != null && castOther.getMonthProd() != null && this
						.getMonthProd().equals(castOther.getMonthProd())))
				&& ((this.getMonthBreakage() == castOther.getMonthBreakage()) || (this.getMonthBreakage() != null
						&& castOther.getMonthBreakage() != null && this.getMonthBreakage().equals(castOther.getMonthBreakage())))
				&& ((this.getMonthNet() == castOther.getMonthNet()) || (this.getMonthNet() != null && castOther.getMonthNet() != null && this
						.getMonthNet().equals(castOther.getMonthNet())))
				&& ((this.getMonthDiesel() == castOther.getMonthDiesel()) || (this.getMonthDiesel() != null && castOther.getMonthDiesel() != null && this
						.getMonthDiesel().equals(castOther.getMonthDiesel())))
				&& ((this.getMonthHrs() == castOther.getMonthHrs()) || (this.getMonthHrs() != null && castOther.getMonthHrs() != null && this
						.getMonthHrs().equals(castOther.getMonthHrs())))
				&& ((this.getMonthNonProdHrs() == castOther.getMonthNonProdHrs()) || (this.getMonthNonProdHrs() != null
						&& castOther.getMonthNonProdHrs() != null && this.getMonthNonProdHrs().equals(castOther.getMonthNonProdHrs())))
				&& ((this.getGrinding() == castOther.getGrinding()) || (this.getGrinding() != null && castOther.getGrinding() != null && this
						.getGrinding().equals(castOther.getGrinding())))
				&& ((this.getRmtbreakage() == castOther.getRmtbreakage()) || (this.getRmtbreakage() != null && castOther.getRmtbreakage() != null && this
						.getRmtbreakage().equals(castOther.getRmtbreakage())))
				&& ((this.getProdrmt() == castOther.getProdrmt()) || (this.getProdrmt() != null && castOther.getProdrmt() != null && this
						.getProdrmt().equals(castOther.getProdrmt())))
				&& ((this.getMachineCode() == castOther.getMachineCode()) || (this.getMachineCode() != null && castOther.getMachineCode() != null && this
						.getMachineCode().equals(castOther.getMachineCode())))
				&& ((this.getMachineName() == castOther.getMachineName()) || (this.getMachineName() != null && castOther.getMachineName() != null && this
						.getMachineName().equals(castOther.getMachineName())))
				&& ((this.getShift() == castOther.getShift()) || (this.getShift() != null && castOther.getShift() != null && this.getShift().equals(
						castOther.getShift())))
				&& ((this.getCutType() == castOther.getCutType()) || (this.getCutType() != null && castOther.getCutType() != null && this
						.getCutType().equals(castOther.getCutType())))
				&& ((this.getReWork() == castOther.getReWork()) || (this.getReWork() != null && castOther.getReWork() != null && this.getReWork()
						.equals(castOther.getReWork())))
				&& ((this.getMaterial() == castOther.getMaterial()) || (this.getMaterial() != null && castOther.getMaterial() != null && this
						.getMaterial().equals(castOther.getMaterial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getOrderNo() == null ? 0 : this.getOrderNo().hashCode());
		result = 37 * result + (getParty() == null ? 0 : this.getParty().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getPcs() == null ? 0 : this.getPcs().hashCode());
		result = 37 * result + (getSqMs() == null ? 0 : this.getSqMs().hashCode());
		result = 37 * result + (getRemarks() == null ? 0 : this.getRemarks().hashCode());
		result = 37 * result + (getBreakage() == null ? 0 : this.getBreakage().hashCode());
		result = 37 * result + (getBreakSqMt() == null ? 0 : this.getBreakSqMt().hashCode());
		result = 37 * result + (getReportType() == null ? 0 : this.getReportType().hashCode());
		result = 37 * result + (getReportId() == null ? 0 : this.getReportId().hashCode());
		result = 37 * result + (getMonthProd() == null ? 0 : this.getMonthProd().hashCode());
		result = 37 * result + (getMonthBreakage() == null ? 0 : this.getMonthBreakage().hashCode());
		result = 37 * result + (getMonthNet() == null ? 0 : this.getMonthNet().hashCode());
		result = 37 * result + (getMonthDiesel() == null ? 0 : this.getMonthDiesel().hashCode());
		result = 37 * result + (getMonthHrs() == null ? 0 : this.getMonthHrs().hashCode());
		result = 37 * result + (getMonthNonProdHrs() == null ? 0 : this.getMonthNonProdHrs().hashCode());
		result = 37 * result + (getGrinding() == null ? 0 : this.getGrinding().hashCode());
		result = 37 * result + (getRmtbreakage() == null ? 0 : this.getRmtbreakage().hashCode());
		result = 37 * result + (getProdrmt() == null ? 0 : this.getProdrmt().hashCode());
		result = 37 * result + (getMachineCode() == null ? 0 : this.getMachineCode().hashCode());
		result = 37 * result + (getMachineName() == null ? 0 : this.getMachineName().hashCode());
		result = 37 * result + (getShift() == null ? 0 : this.getShift().hashCode());
		result = 37 * result + (getCutType() == null ? 0 : this.getCutType().hashCode());
		result = 37 * result + (getReWork() == null ? 0 : this.getReWork().hashCode());
		result = 37 * result + (getMaterial() == null ? 0 : this.getMaterial().hashCode());
		return result;
	}

}
