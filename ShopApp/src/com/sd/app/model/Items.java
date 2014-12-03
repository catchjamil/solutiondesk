package com.sd.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="item_val")
public class Items implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 330241890876614002L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "item_id")  
	private Integer itemId;


	@Column
	private String particulars;
	@Column
	private String type;
	@Column
	private String code;
	@Column
	private String uom;
	
	@ManyToOne  
	@JoinColumn(name = "item_group_id")  
	private ItemGroup itemGroup;  



	public ItemGroup getItemGroup() {
		return itemGroup;
	}


	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}


	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public String getParticulars() {
		return particulars;
	}


	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getUom() {
		return uom;
	}


	public void setUom(String uom) {
		this.uom = uom;
	}



}
