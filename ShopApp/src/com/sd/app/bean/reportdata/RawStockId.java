package com.sd.app.bean.reportdata;

// Generated Nov 22, 2014 1:17:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * RawStockId generated by hbm2java
 */
public class RawStockId implements java.io.Serializable {

	private String coCode;
	private Date sdate;
	private Float thick;
	private String icode;
	private String particulars;
	private Short width;
	private Short height;
	private Float sheets;
	private Double sqMs;
	private Short reverved;
	private Short ordered;
	private Short damaged;
	private Short reserved;
	private String reserveNotes;
	private Short minStock;
	private Short reOrder;
	private Short maxStock;

	public RawStockId() {
	}

	public RawStockId(String coCode, Date sdate, Float thick, String icode, String particulars, Short width, Short height, Float sheets, Double sqMs,
			Short reverved, Short ordered, Short damaged, Short reserved, String reserveNotes, Short minStock, Short reOrder, Short maxStock) {
		this.coCode = coCode;
		this.sdate = sdate;
		this.thick = thick;
		this.icode = icode;
		this.particulars = particulars;
		this.width = width;
		this.height = height;
		this.sheets = sheets;
		this.sqMs = sqMs;
		this.reverved = reverved;
		this.ordered = ordered;
		this.damaged = damaged;
		this.reserved = reserved;
		this.reserveNotes = reserveNotes;
		this.minStock = minStock;
		this.reOrder = reOrder;
		this.maxStock = maxStock;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public Date getSdate() {
		return this.sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
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

	public Float getSheets() {
		return this.sheets;
	}

	public void setSheets(Float sheets) {
		this.sheets = sheets;
	}

	public Double getSqMs() {
		return this.sqMs;
	}

	public void setSqMs(Double sqMs) {
		this.sqMs = sqMs;
	}

	public Short getReverved() {
		return this.reverved;
	}

	public void setReverved(Short reverved) {
		this.reverved = reverved;
	}

	public Short getOrdered() {
		return this.ordered;
	}

	public void setOrdered(Short ordered) {
		this.ordered = ordered;
	}

	public Short getDamaged() {
		return this.damaged;
	}

	public void setDamaged(Short damaged) {
		this.damaged = damaged;
	}

	public Short getReserved() {
		return this.reserved;
	}

	public void setReserved(Short reserved) {
		this.reserved = reserved;
	}

	public String getReserveNotes() {
		return this.reserveNotes;
	}

	public void setReserveNotes(String reserveNotes) {
		this.reserveNotes = reserveNotes;
	}

	public Short getMinStock() {
		return this.minStock;
	}

	public void setMinStock(Short minStock) {
		this.minStock = minStock;
	}

	public Short getReOrder() {
		return this.reOrder;
	}

	public void setReOrder(Short reOrder) {
		this.reOrder = reOrder;
	}

	public Short getMaxStock() {
		return this.maxStock;
	}

	public void setMaxStock(Short maxStock) {
		this.maxStock = maxStock;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RawStockId))
			return false;
		RawStockId castOther = (RawStockId) other;

		return ((this.getCoCode() == castOther.getCoCode()) || (this.getCoCode() != null && castOther.getCoCode() != null && this.getCoCode().equals(
				castOther.getCoCode())))
				&& ((this.getSdate() == castOther.getSdate()) || (this.getSdate() != null && castOther.getSdate() != null && this.getSdate().equals(
						castOther.getSdate())))
				&& ((this.getThick() == castOther.getThick()) || (this.getThick() != null && castOther.getThick() != null && this.getThick().equals(
						castOther.getThick())))
				&& ((this.getIcode() == castOther.getIcode()) || (this.getIcode() != null && castOther.getIcode() != null && this.getIcode().equals(
						castOther.getIcode())))
				&& ((this.getParticulars() == castOther.getParticulars()) || (this.getParticulars() != null && castOther.getParticulars() != null && this
						.getParticulars().equals(castOther.getParticulars())))
				&& ((this.getWidth() == castOther.getWidth()) || (this.getWidth() != null && castOther.getWidth() != null && this.getWidth().equals(
						castOther.getWidth())))
				&& ((this.getHeight() == castOther.getHeight()) || (this.getHeight() != null && castOther.getHeight() != null && this.getHeight()
						.equals(castOther.getHeight())))
				&& ((this.getSheets() == castOther.getSheets()) || (this.getSheets() != null && castOther.getSheets() != null && this.getSheets()
						.equals(castOther.getSheets())))
				&& ((this.getSqMs() == castOther.getSqMs()) || (this.getSqMs() != null && castOther.getSqMs() != null && this.getSqMs().equals(
						castOther.getSqMs())))
				&& ((this.getReverved() == castOther.getReverved()) || (this.getReverved() != null && castOther.getReverved() != null && this
						.getReverved().equals(castOther.getReverved())))
				&& ((this.getOrdered() == castOther.getOrdered()) || (this.getOrdered() != null && castOther.getOrdered() != null && this
						.getOrdered().equals(castOther.getOrdered())))
				&& ((this.getDamaged() == castOther.getDamaged()) || (this.getDamaged() != null && castOther.getDamaged() != null && this
						.getDamaged().equals(castOther.getDamaged())))
				&& ((this.getReserved() == castOther.getReserved()) || (this.getReserved() != null && castOther.getReserved() != null && this
						.getReserved().equals(castOther.getReserved())))
				&& ((this.getReserveNotes() == castOther.getReserveNotes()) || (this.getReserveNotes() != null && castOther.getReserveNotes() != null && this
						.getReserveNotes().equals(castOther.getReserveNotes())))
				&& ((this.getMinStock() == castOther.getMinStock()) || (this.getMinStock() != null && castOther.getMinStock() != null && this
						.getMinStock().equals(castOther.getMinStock())))
				&& ((this.getReOrder() == castOther.getReOrder()) || (this.getReOrder() != null && castOther.getReOrder() != null && this
						.getReOrder().equals(castOther.getReOrder())))
				&& ((this.getMaxStock() == castOther.getMaxStock()) || (this.getMaxStock() != null && castOther.getMaxStock() != null && this
						.getMaxStock().equals(castOther.getMaxStock())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCoCode() == null ? 0 : this.getCoCode().hashCode());
		result = 37 * result + (getSdate() == null ? 0 : this.getSdate().hashCode());
		result = 37 * result + (getThick() == null ? 0 : this.getThick().hashCode());
		result = 37 * result + (getIcode() == null ? 0 : this.getIcode().hashCode());
		result = 37 * result + (getParticulars() == null ? 0 : this.getParticulars().hashCode());
		result = 37 * result + (getWidth() == null ? 0 : this.getWidth().hashCode());
		result = 37 * result + (getHeight() == null ? 0 : this.getHeight().hashCode());
		result = 37 * result + (getSheets() == null ? 0 : this.getSheets().hashCode());
		result = 37 * result + (getSqMs() == null ? 0 : this.getSqMs().hashCode());
		result = 37 * result + (getReverved() == null ? 0 : this.getReverved().hashCode());
		result = 37 * result + (getOrdered() == null ? 0 : this.getOrdered().hashCode());
		result = 37 * result + (getDamaged() == null ? 0 : this.getDamaged().hashCode());
		result = 37 * result + (getReserved() == null ? 0 : this.getReserved().hashCode());
		result = 37 * result + (getReserveNotes() == null ? 0 : this.getReserveNotes().hashCode());
		result = 37 * result + (getMinStock() == null ? 0 : this.getMinStock().hashCode());
		result = 37 * result + (getReOrder() == null ? 0 : this.getReOrder().hashCode());
		result = 37 * result + (getMaxStock() == null ? 0 : this.getMaxStock().hashCode());
		return result;
	}

}
