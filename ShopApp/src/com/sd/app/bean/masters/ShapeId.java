package com.sd.app.bean.masters;

// Generated Nov 22, 2014 1:22:06 PM by Hibernate Tools 3.4.0.CR1

/**
 * ShapeId generated by hbm2java
 */
public class ShapeId implements java.io.Serializable {

	private Short sno;
	private String name;
	private String shape;
	private Short ndim;
	private Short segTyp;
	private Short hole;
	private String seg;

	public ShapeId() {
	}

	public ShapeId(Short sno, String name, String shape, Short ndim, Short segTyp, Short hole, String seg) {
		this.sno = sno;
		this.name = name;
		this.shape = shape;
		this.ndim = ndim;
		this.segTyp = segTyp;
		this.hole = hole;
		this.seg = seg;
	}

	public Short getSno() {
		return this.sno;
	}

	public void setSno(Short sno) {
		this.sno = sno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShape() {
		return this.shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Short getNdim() {
		return this.ndim;
	}

	public void setNdim(Short ndim) {
		this.ndim = ndim;
	}

	public Short getSegTyp() {
		return this.segTyp;
	}

	public void setSegTyp(Short segTyp) {
		this.segTyp = segTyp;
	}

	public Short getHole() {
		return this.hole;
	}

	public void setHole(Short hole) {
		this.hole = hole;
	}

	public String getSeg() {
		return this.seg;
	}

	public void setSeg(String seg) {
		this.seg = seg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShapeId))
			return false;
		ShapeId castOther = (ShapeId) other;

		return ((this.getSno() == castOther.getSno()) || (this.getSno() != null && castOther.getSno() != null && this.getSno().equals(
				castOther.getSno())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null && this.getName().equals(
						castOther.getName())))
				&& ((this.getShape() == castOther.getShape()) || (this.getShape() != null && castOther.getShape() != null && this.getShape().equals(
						castOther.getShape())))
				&& ((this.getNdim() == castOther.getNdim()) || (this.getNdim() != null && castOther.getNdim() != null && this.getNdim().equals(
						castOther.getNdim())))
				&& ((this.getSegTyp() == castOther.getSegTyp()) || (this.getSegTyp() != null && castOther.getSegTyp() != null && this.getSegTyp()
						.equals(castOther.getSegTyp())))
				&& ((this.getHole() == castOther.getHole()) || (this.getHole() != null && castOther.getHole() != null && this.getHole().equals(
						castOther.getHole())))
				&& ((this.getSeg() == castOther.getSeg()) || (this.getSeg() != null && castOther.getSeg() != null && this.getSeg().equals(
						castOther.getSeg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSno() == null ? 0 : this.getSno().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getShape() == null ? 0 : this.getShape().hashCode());
		result = 37 * result + (getNdim() == null ? 0 : this.getNdim().hashCode());
		result = 37 * result + (getSegTyp() == null ? 0 : this.getSegTyp().hashCode());
		result = 37 * result + (getHole() == null ? 0 : this.getHole().hashCode());
		result = 37 * result + (getSeg() == null ? 0 : this.getSeg().hashCode());
		return result;
	}

}
