package com.sd.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sd.app.constraint.ItemAction;
import com.sd.app.constraint.Status;
import com.sd.app.model.Item;
import com.sd.app.model.ItemGroup;
import com.sd.app.model.ItemMaster;
import com.sd.app.model.Items;


@Repository("itemDao")
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	public List<ItemMaster> listBuyItems() {

		Session currentSession = sessionFactory.getCurrentSession();
		List<ItemMaster> itemMasters= (List<ItemMaster>) currentSession.createQuery("FROM ItemMaster WHERE itemAction='"+ItemAction.BUY+"' AND status!='"+Status.DELETE+"'").list();
		return itemMasters;
	}

	public ItemMaster getItem(int id) {
		return (ItemMaster) sessionFactory.getCurrentSession().get(ItemMaster.class, id);
	}

	public void deleteItem(int id) {

		ItemMaster item = getItem(id);
		item.setStatus(Status.DELETE.toString());
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	public List<ItemMaster> listSellItems() {
		Session currentSession = sessionFactory.getCurrentSession();
		return (List<ItemMaster>) currentSession.createQuery("FROM ItemMaster WHERE itemAction='"+ItemAction.SELL+"' and status!='"+Status.DELETE+"'").list();

	}

	@Override
	public void saveItem(ItemMaster itemMaster) {
		// TODO Auto-generated method stub
		itemMaster.setStatus(Status.ADD.toString());
		sessionFactory.getCurrentSession().save(itemMaster);

	}

	@Override
	public void saveSellItem(ItemMaster itemMaster) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		List<Item> items = itemMaster.getItems();
		for(Item item : items){
			Item itemDb = (Item)currentSession.get(Item.class, item.getId());
			try{
				int q = item.getQuantity() != null? Integer.parseInt(item.getQuantity()):0;
				int sq = itemDb.getSoldQuantity() != null? Integer.parseInt(itemDb.getSoldQuantity()) : 0;
				itemDb.setSoldQuantity((q+sq)+"");
			}catch(Exception e){
				e.printStackTrace();
			}

			currentSession.flush();
			item.setId(null);
		}
		itemMaster.setStatus(Status.ADD.toString());
		sessionFactory.getCurrentSession().save(itemMaster);

	}

	@Override
	public List<ItemMaster> listOfAvailableItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getChildItem(int id) {
		return (Item) sessionFactory.getCurrentSession().get(Item.class, id);
	}


	@SuppressWarnings("unchecked")
	public List<ItemGroup> getAllItemGroups() {
		Session currentSession = sessionFactory.getCurrentSession();
		return (List<ItemGroup>) currentSession.createQuery("FROM ItemGroup").list();

	}


	public List<Items> getAllItemsByGoupId(int id)throws Exception {

		try{	
			List<Items> itemList=new ArrayList<>();

			Session currentSession = sessionFactory.getCurrentSession();

			itemList.addAll((List<Items>)currentSession.createQuery("FROM Items it WHERE it.itemGroup.itemGroupId='"+id+"'").list());

			return itemList;
		}catch(Exception e){
			throw e;
		}
	}


	public boolean saveItemGroup(ItemGroup itemGroup)throws Exception {
		try{
			sessionFactory.getCurrentSession().save(itemGroup);
			return true;
		}catch(Exception e){
			throw e;
		}

	}
	
	public boolean saveGroupItems(Items item)throws Exception {
		try{
			sessionFactory.getCurrentSession().save(item);
			return true;
		}catch(Exception e){
			throw e;
		}

	}

}
