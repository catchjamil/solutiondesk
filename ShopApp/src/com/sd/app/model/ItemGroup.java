package com.sd.app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="ItemGroup")
public class ItemGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5305329672652516855L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "item_group_id")
	private Integer itemGroupId;
	
	@Column
	private Boolean glassItem;
	
	@Column
	private String groupCode;
	
	@Column
	private String description;
	
	@OneToMany(mappedBy = "itemGroup",fetch = FetchType.EAGER)  
	private Set<Items> itemSet=new HashSet<>();
	
	

	public Integer getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public boolean isGlassItem() {
		return glassItem;
	}

	public void setGlassItem(boolean glassItem) {
		this.glassItem = glassItem;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Items> getItemSet() {
		return itemSet;
	}

	public void setItemSet(Set<Items> itemSet) {
		this.itemSet = itemSet;
	}




}
