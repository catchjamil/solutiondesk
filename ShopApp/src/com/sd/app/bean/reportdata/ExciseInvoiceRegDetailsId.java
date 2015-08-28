package com.sd.app.bean.reportdata;

// Generated Nov 22, 2014 1:17:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ExciseInvoiceRegDetailsId generated by hbm2java
 */
public class ExciseInvoiceRegDetailsId implements java.io.Serializable {

	private String coCode;
	private Integer invNo;
	private Date date;
	private String party;
	private String tariff;
	private Float thick;
	private String icode;
	private String tough;
	private String material;
	private Float sqMt;
	private Float sqMtExport;
	private Double basicForExcise;
	private Float exciseAmount;
	private Float ecessOnDuty;
	private Float staxAmount;
	private Float freightAmount;
	private Float serviceTaxAmount;
	private Float ecessOnServiceTax;
	private Float insuranceAmount;
	private Float rawMaterialAmount;
	private Double billAmount;
	private Double billAmountExport;
	private Float handlingAmount;
	private Float totAmount;
	private Float hsecessOnDuty;

	public ExciseInvoiceRegDetailsId() {
	}

	public ExciseInvoiceRegDetailsId(String coCode, Integer invNo, Date date, String party, String tariff, Float thick, String icode, String tough,
			String material, Float sqMt, Float sqMtExport, Double basicForExcise, Float exciseAmount, Float ecessOnDuty, Float staxAmount,
			Float freightAmount, Float serviceTaxAmount, Float ecessOnServiceTax, Float insuranceAmount, Float rawMaterialAmount, Double billAmount,
			Double billAmountExport, Float handlingAmount, Float totAmount, Float hsecessOnDuty) {
		this.coCode = coCode;
		this.invNo = invNo;
		this.date = date;
		this.party = party;
		this.tariff = tariff;
		this.thick = thick;
		this.icode = icode;
		this.tough = tough;
		this.material = material;
		this.sqMt = sqMt;
		this.sqMtExport = sqMtExport;
		this.basicForExcise = basicForExcise;
		this.exciseAmount = exciseAmount;
		this.ecessOnDuty = ecessOnDuty;
		this.staxAmount = staxAmount;
		this.freightAmount = freightAmount;
		this.serviceTaxAmount = serviceTaxAmount;
		this.ecessOnServiceTax = ecessOnServiceTax;
		this.insuranceAmount = insuranceAmount;
		this.rawMaterialAmount = rawMaterialAmount;
		this.billAmount = billAmount;
		this.billAmountExport = billAmountExport;
		this.handlingAmount = handlingAmount;
		this.totAmount = totAmount;
		this.hsecessOnDuty = hsecessOnDuty;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public Integer getInvNo() {
		return this.invNo;
	}

	public void setInvNo(Integer invNo) {
		this.invNo = invNo;
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

	public String getTariff() {
		return this.tariff;
	}

	public void setTariff(String tariff) {
		this.tariff = tariff;
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

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Float getSqMt() {
		return this.sqMt;
	}

	public void setSqMt(Float sqMt) {
		this.sqMt = sqMt;
	}

	public Float getSqMtExport() {
		return this.sqMtExport;
	}

	public void setSqMtExport(Float sqMtExport) {
		this.sqMtExport = sqMtExport;
	}

	public Double getBasicForExcise() {
		return this.basicForExcise;
	}

	public void setBasicForExcise(Double basicForExcise) {
		this.basicForExcise = basicForExcise;
	}

	public Float getExciseAmount() {
		return this.exciseAmount;
	}

	public void setExciseAmount(Float exciseAmount) {
		this.exciseAmount = exciseAmount;
	}

	public Float getEcessOnDuty() {
		return this.ecessOnDuty;
	}

	public void setEcessOnDuty(Float ecessOnDuty) {
		this.ecessOnDuty = ecessOnDuty;
	}

	public Float getStaxAmount() {
		return this.staxAmount;
	}

	public void setStaxAmount(Float staxAmount) {
		this.staxAmount = staxAmount;
	}

	public Float getFreightAmount() {
		return this.freightAmount;
	}

	public void setFreightAmount(Float freightAmount) {
		this.freightAmount = freightAmount;
	}

	public Float getServiceTaxAmount() {
		return this.serviceTaxAmount;
	}

	public void setServiceTaxAmount(Float serviceTaxAmount) {
		this.serviceTaxAmount = serviceTaxAmount;
	}

	public Float getEcessOnServiceTax() {
		return this.ecessOnServiceTax;
	}

	public void setEcessOnServiceTax(Float ecessOnServiceTax) {
		this.ecessOnServiceTax = ecessOnServiceTax;
	}

	public Float getInsuranceAmount() {
		return this.insuranceAmount;
	}

	public void setInsuranceAmount(Float insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Float getRawMaterialAmount() {
		return this.rawMaterialAmount;
	}

	public void setRawMaterialAmount(Float rawMaterialAmount) {
		this.rawMaterialAmount = rawMaterialAmount;
	}

	public Double getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public Double getBillAmountExport() {
		return this.billAmountExport;
	}

	public void setBillAmountExport(Double billAmountExport) {
		this.billAmountExport = billAmountExport;
	}

	public Float getHandlingAmount() {
		return this.handlingAmount;
	}

	public void setHandlingAmount(Float handlingAmount) {
		this.handlingAmount = handlingAmount;
	}

	public Float getTotAmount() {
		return this.totAmount;
	}

	public void setTotAmount(Float totAmount) {
		this.totAmount = totAmount;
	}

	public Float getHsecessOnDuty() {
		return this.hsecessOnDuty;
	}

	public void setHsecessOnDuty(Float hsecessOnDuty) {
		this.hsecessOnDuty = hsecessOnDuty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExciseInvoiceRegDetailsId))
			return false;
		ExciseInvoiceRegDetailsId castOther = (ExciseInvoiceRegDetailsId) other;

		return ((this.getCoCode() == castOther.getCoCode()) || (this.getCoCode() != null && castOther.getCoCode() != null && this.getCoCode().equals(
				castOther.getCoCode())))
				&& ((this.getInvNo() == castOther.getInvNo()) || (this.getInvNo() != null && castOther.getInvNo() != null && this.getInvNo().equals(
						castOther.getInvNo())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null && this.getDate().equals(
						castOther.getDate())))
				&& ((this.getParty() == castOther.getParty()) || (this.getParty() != null && castOther.getParty() != null && this.getParty().equals(
						castOther.getParty())))
				&& ((this.getTariff() == castOther.getTariff()) || (this.getTariff() != null && castOther.getTariff() != null && this.getTariff()
						.equals(castOther.getTariff())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getTough() == castOther.getTough()) || (this.getTough() != null && castOther.getTough() != null && this.getTough().equals(
						castOther.getTough())))
				&& ((this.getMaterial() == castOther.getMaterial()) || (this.getMaterial() != null && castOther.getMaterial() != null && this
						.getMaterial().equals(castOther.getMaterial())))
				&& ((this.getSqMt() == castOther.getSqMt()) || (this.getSqMt() != null && castOther.getSqMt() != null && this.getSqMt().equals(
						castOther.getSqMt())))
				&& ((this.getSqMtExport() == castOther.getSqMtExport()) || (this.getSqMtExport() != null && castOther.getSqMtExport() != null && this
						.getSqMtExport().equals(castOther.getSqMtExport())))
				&& ((this.getBasicForExcise() == castOther.getBasicForExcise()) || (this.getBasicForExcise() != null
						&& castOther.getBasicForExcise() != null && this.getBasicForExcise().equals(castOther.getBasicForExcise())))
				&& ((this.getExciseAmount() == castOther.getExciseAmount()) || (this.getExciseAmount() != null && castOther.getExciseAmount() != null && this
						.getExciseAmount().equals(castOther.getExciseAmount())))
				&& ((this.getEcessOnDuty() == castOther.getEcessOnDuty()) || (this.getEcessOnDuty() != null && castOther.getEcessOnDuty() != null && this
						.getEcessOnDuty().equals(castOther.getEcessOnDuty())))
				&& ((this.getStaxAmount() == castOther.getStaxAmount()) || (this.getStaxAmount() != null && castOther.getStaxAmount() != null && this
						.getStaxAmount().equals(castOther.getStaxAmount())))
				&& ((this.getFreightAmount() == castOther.getFreightAmount()) || (this.getFreightAmount() != null
						&& castOther.getFreightAmount() != null && this.getFreightAmount().equals(castOther.getFreightAmount())))
				&& ((this.getServiceTaxAmount() == castOther.getServiceTaxAmount()) || (this.getServiceTaxAmount() != null
						&& castOther.getServiceTaxAmount() != null && this.getServiceTaxAmount().equals(castOther.getServiceTaxAmount())))
				&& ((this.getEcessOnServiceTax() == castOther.getEcessOnServiceTax()) || (this.getEcessOnServiceTax() != null
						&& castOther.getEcessOnServiceTax() != null && this.getEcessOnServiceTax().equals(castOther.getEcessOnServiceTax())))
				&& ((this.getInsuranceAmount() == castOther.getInsuranceAmount()) || (this.getInsuranceAmount() != null
						&& castOther.getInsuranceAmount() != null && this.getInsuranceAmount().equals(castOther.getInsuranceAmount())))
				&& ((this.getRawMaterialAmount() == castOther.getRawMaterialAmount()) || (this.getRawMaterialAmount() != null
						&& castOther.getRawMaterialAmount() != null && this.getRawMaterialAmount().equals(castOther.getRawMaterialAmount())))
				&& ((this.getBillAmount() == castOther.getBillAmount()) || (this.getBillAmount() != null && castOther.getBillAmount() != null && this
						.getBillAmount().equals(castOther.getBillAmount())))
				&& ((this.getBillAmountExport() == castOther.getBillAmountExport()) || (this.getBillAmountExport() != null
						&& castOther.getBillAmountExport() != null && this.getBillAmountExport().equals(castOther.getBillAmountExport())))
				&& ((this.getHandlingAmount() == castOther.getHandlingAmount()) || (this.getHandlingAmount() != null
						&& castOther.getHandlingAmount() != null && this.getHandlingAmount().equals(castOther.getHandlingAmount())))
				&& ((this.getTotAmount() == castOther.getTotAmount()) || (this.getTotAmount() != null && castOther.getTotAmount() != null && this
						.getTotAmount().equals(castOther.getTotAmount())))
				&& ((this.getHsecessOnDuty() == castOther.getHsecessOnDuty()) || (this.getHsecessOnDuty() != null
						&& castOther.getHsecessOnDuty() != null && this.getHsecessOnDuty().equals(castOther.getHsecessOnDuty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCoCode() == null ? 0 : this.getCoCode().hashCode());
		result = 37 * result + (getInvNo() == null ? 0 : this.getInvNo().hashCode());
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getParty() == null ? 0 : this.getParty().hashCode());
		result = 37 * result + (getTariff() == null ? 0 : this.getTariff().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getTough() == null ? 0 : this.getTough().hashCode());
		result = 37 * result + (getMaterial() == null ? 0 : this.getMaterial().hashCode());
		result = 37 * result + (getSqMt() == null ? 0 : this.getSqMt().hashCode());
		result = 37 * result + (getSqMtExport() == null ? 0 : this.getSqMtExport().hashCode());
		result = 37 * result + (getBasicForExcise() == null ? 0 : this.getBasicForExcise().hashCode());
		result = 37 * result + (getExciseAmount() == null ? 0 : this.getExciseAmount().hashCode());
		result = 37 * result + (getEcessOnDuty() == null ? 0 : this.getEcessOnDuty().hashCode());
		result = 37 * result + (getStaxAmount() == null ? 0 : this.getStaxAmount().hashCode());
		result = 37 * result + (getFreightAmount() == null ? 0 : this.getFreightAmount().hashCode());
		result = 37 * result + (getServiceTaxAmount() == null ? 0 : this.getServiceTaxAmount().hashCode());
		result = 37 * result + (getEcessOnServiceTax() == null ? 0 : this.getEcessOnServiceTax().hashCode());
		result = 37 * result + (getInsuranceAmount() == null ? 0 : this.getInsuranceAmount().hashCode());
		result = 37 * result + (getRawMaterialAmount() == null ? 0 : this.getRawMaterialAmount().hashCode());
		result = 37 * result + (getBillAmount() == null ? 0 : this.getBillAmount().hashCode());
		result = 37 * result + (getBillAmountExport() == null ? 0 : this.getBillAmountExport().hashCode());
		result = 37 * result + (getHandlingAmount() == null ? 0 : this.getHandlingAmount().hashCode());
		result = 37 * result + (getTotAmount() == null ? 0 : this.getTotAmount().hashCode());
		result = 37 * result + (getHsecessOnDuty() == null ? 0 : this.getHsecessOnDuty().hashCode());
		return result;
	}

}
