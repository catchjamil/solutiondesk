package com.sd.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sd.app.bean.ItemBean;
import com.sd.app.bean.ItemGroupBean;
import com.sd.app.bean.ItemsBean;
import com.sd.app.dao.ItemDao;
import com.sd.app.model.Item;
import com.sd.app.model.ItemGroup;
import com.sd.app.model.ItemMaster;
import com.sd.app.model.Items;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void saveItem(ItemMaster itemMaster) {
		itemDao.saveItem(itemMaster);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void saveSellItem(ItemMaster itemMaster) {
		itemDao.saveSellItem(itemMaster);
	}

	public List<ItemMaster> listBuyItems() {
		return itemDao.listBuyItems();
	}

	public ItemMaster getItem(int empid) {
		return itemDao.getItem(empid);
	}

	public void deleteItem(int id) {
		itemDao.deleteItem(id);
	}

	@Override
	public List<ItemMaster> listSellItems() {
		return itemDao.listSellItems();
	}

	@Override
	public List<ItemMaster> listOfAvailableItems() {
		return itemDao.listOfAvailableItems();
	}

	@Override
	public Item getChildItem(int id) {
		return itemDao.getChildItem(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<ItemGroup> getAllItemGroups(){

		return itemDao.getAllItemGroups();
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<Items> getAllItemsByGoupId(int id)throws Exception{

		try{
			List<Items> itemList=itemDao.getAllItemsByGoupId(id);

			if(itemList!=null && itemList.size()>0){

				return itemList;
			}

		}catch(Exception e){
			throw e;
		}
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean saveItemGroup(ItemGroupBean itemGroupBean) throws Exception {
		
		ItemGroup itemGroup=new ItemGroup();
		
		
		itemGroup.setDescription(itemGroupBean.getDescription());
		itemGroup.setGroupCode(itemGroupBean.getGroupCode());
		
		if(itemGroupBean.getGlassItem().equalsIgnoreCase("YES")){
			itemGroup.setGlassItem(true);
		}else{
			itemGroup.setGlassItem(false);
		}
		
		if(itemDao.saveItemGroup(itemGroup)){
			return true;
		}
		
		return false;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean saveGroupItems(ItemsBean itemsBean)throws Exception{
		
		Items items=new Items();
		
		items.setCode(itemsBean.getCode());
		items.setParticulars(itemsBean.getParticulars());
		items.setType(itemsBean.getType());
		
		itemDao.saveGroupItems(items);
		
		
		return true;
	}


}
