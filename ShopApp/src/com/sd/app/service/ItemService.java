package com.sd.app.service;

import java.util.List;

import com.sd.app.bean.ItemGroupBean;
import com.sd.app.bean.ItemsBean;
import com.sd.app.model.Item;
import com.sd.app.model.ItemGroup;
import com.sd.app.model.ItemMaster;
import com.sd.app.model.Items;


public interface ItemService {
	
	public void saveItem(ItemMaster itemMasters);
	public void saveSellItem(ItemMaster itemMasters);
	public List<ItemMaster> listSellItems();
	public List<ItemMaster> listBuyItems();
	public List<ItemMaster> listOfAvailableItems();
	public ItemMaster getItem(int id);
	public Item getChildItem(int id);
	public void deleteItem(int id);
	
	
	public List<ItemGroup> getAllItemGroups();
	public List<Items> getAllItemsByGoupId(int id)throws Exception;
	public boolean saveItemGroup(ItemGroupBean itemGroupBean)throws Exception;
	public boolean saveGroupItems(ItemsBean itemsBean)throws Exception;


}		