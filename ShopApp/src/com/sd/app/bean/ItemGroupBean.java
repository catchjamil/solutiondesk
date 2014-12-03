package com.sd.app.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "itemgroup")
public class ItemGroupBean implements Serializable{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5128859190921083692L;


	private Integer itemGroupId;
	
	
	private String glassItem;
	
	
	private String groupCode;
	
	
	private String description;
	
	  
	private Set<ItemsBean> itemSet=new HashSet<>();
	
	

	public Integer getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}


	public String getGlassItem() {
		return glassItem;
	}

	public void setGlassItem(String glassItem) {
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

	public Set<ItemsBean> getItemSet() {
		return itemSet;
	}

	public void setItemSet(Set<ItemsBean> itemSet) {
		this.itemSet = itemSet;
	}




}
