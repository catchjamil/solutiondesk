package com.sd.app.dao;

import java.util.List;

import com.sd.app.model.Item;
import com.sd.app.model.ItemGroup;
import com.sd.app.model.ItemMaster;
import com.sd.app.model.Items;


public interface ItemDao {

	public void saveItem(ItemMaster itemMaster);
	public void saveSellItem(ItemMaster itemMaster);
	public List<ItemMaster> listSellItems();
	public List<ItemMaster> listOfAvailableItems();
	public List<ItemMaster> listBuyItems();
	public ItemMaster getItem(int id);
	public Item getChildItem(int id);
	public void deleteItem(int id);





	public List<ItemGroup> getAllItemGroups();
	public List<Items> getAllItemsByGoupId(int id)throws Exception ;
	public boolean saveItemGroup(ItemGroup itemGroup)throws Exception;
	public boolean saveGroupItems(Items item)throws Exception;

}
