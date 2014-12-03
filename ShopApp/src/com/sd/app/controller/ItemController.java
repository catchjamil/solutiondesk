package com.sd.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sd.app.bean.ItemBean;
import com.sd.app.bean.ItemGroupBean;
import com.sd.app.bean.ItemsBean;
import com.sd.app.constraint.ItemAction;
import com.sd.app.model.Item;
import com.sd.app.model.ItemMaster;
import com.sd.app.model.Items;
import com.sd.app.service.ItemService;


@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/saveItem", method = RequestMethod.POST)
	public ModelAndView saveItem(@ModelAttribute("command") ItemMaster itemMaster, 
			BindingResult result) {
		// Item item = prepareModel(ItemBean);
		// itemService.addItem(item);
		itemMaster.setItemAction(ItemAction.BUY.toString());
		itemService.saveItem(itemMaster);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("items",  itemService.listBuyItems());
		return new ModelAndView("itemsList", model);
	}
	
	

	
	
	
	
	
	

	

	@RequestMapping(value = "/addItem", method = RequestMethod.GET)
	public ModelAndView addItem(@ModelAttribute("command")  ItemMaster itemMaster,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		//itemService.saveSellItems(itemMaster);
		//model.put("items",  prepareListofBean(itemService.listItems()));
		return new ModelAndView("addItem", model);
	}
	
	/*@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}*/
	
	@RequestMapping(value = "/deleteItem", method = RequestMethod.GET)
	public ModelAndView deleteItem(@ModelAttribute("command")  ItemMaster itemMaster,
			BindingResult result,HttpServletRequest request) {
		int parseInt = Integer.parseInt(request.getParameter("id"));
		
		itemService.deleteItem(parseInt);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("items",  itemService.listBuyItems());
		return new ModelAndView("itemsList", model);
	}
	
	@RequestMapping(value = "/editItem", method = RequestMethod.GET)
	public ModelAndView editItem(@ModelAttribute("command")  ItemMaster itemMaster,
			BindingResult result, HttpServletRequest request) {
		
		int parseInt = Integer.parseInt(request.getParameter("id"));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("item", itemService.getItem(parseInt));
		///model.put("items",  prepareListofBean(itemService.listItems()));
		return new ModelAndView("addItem", model);
	}
	
	private Item prepareModel(ItemBean itemBean){
		Item item = new Item();
		item.setId(itemBean.getId());
		item.setName(itemBean.getName());
		item.setSize(itemBean.getSize());
		item.setQuantity(itemBean.getQuantity());
		try{
			Double price = new Double(itemBean.getPrice());
			item.setPrice(price != null? price: 0.0);
		}catch(Exception e){
			e.printStackTrace();
		}
		item.setDescription(itemBean.getDescription());
		itemBean.setId(null);
		return item;
	}
	
	private List<ItemBean> prepareListofBean(List<ItemMaster> items){/*
		ItemMaster itemMaster = new ItemMaster();
		List<ItemBean> beans = null;
		if(items != null && !items.isEmpty()){
			beans = new ArrayList<ItemBean>();
			ItemBean bean = null;
			for(Item item : items){
				bean = new ItemBean();
				
				bean.setId(item.getId());
				bean.setName(item.getName());
				bean.setSize(item.getSize());
				bean.setBuyFrom(item.getBuyFrom());
				bean.setQuantity(item.getQuantity());
				
				bean.setPrice(item.getPrice() != null?item.getPrice()+"":"0.0");
				bean.setDescription(item.getDescription());

				beans.add(bean);
			}
		}
		return beans;
	*/
	return null;	
	}
	
	private ItemBean prepareItemBean(Item item){
		ItemBean bean = new ItemBean();

		bean.setId(item.getId());
		bean.setName(item.getName());
		bean.setSize(item.getSize());
		bean.setQuantity(item.getQuantity());
		bean.setPrice(item.getPrice()+"");
		bean.setDescription(item.getDescription());
		
		return bean;
	}
	
/*	@RequestMapping(value="/viewItems", method = RequestMethod.GET)
	public ModelAndView viewItems(@RequestParam("itemId") String itemId) {
		Map<String, Object> model = new HashMap<String, Object>();
		if(itemId!=null && !itemId.equals("")){
			model.put("itemList",  itemService.getAllItemsByGoupId(Integer.parseInt(itemId)));
		}
		return new ModelAndView("items_list", model);
	}
	
*/	
	
	
	
	
	@RequestMapping(value="/viewItems", method=RequestMethod.GET)
    public @ResponseBody  List<ItemsBean> viewItems(@RequestParam("itemId") String itemId) {
		try{
			if(itemId!=null && !itemId.equals("")){
				 
				List<Items> itemsList=itemService.getAllItemsByGoupId(Integer.parseInt(itemId));
				List<ItemsBean> itemsBeanList=new ArrayList<>();
				
				if(itemsList!=null){
					
					for(Items it : itemsList){
						
						ItemsBean itBean=new ItemsBean();
						
						itBean.setCode(it.getCode());
						itBean.setItemId(it.getItemId());
						itBean.setParticulars(it.getParticulars());
						itBean.setType(it.getType());
						itBean.setUom(it.getUom());
						
						itemsBeanList.add(itBean);
						
					}
				}
				return itemsBeanList;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	   return null;
    }
	
	
	@RequestMapping(value = "/saveItemGroup", method = RequestMethod.POST)
	public ModelAndView saveItemGroup(@ModelAttribute("command") ItemGroupBean itemGroupBean, 
			BindingResult result) {
		 try {
			if(itemService.saveItemGroup(itemGroupBean)){
				return new ModelAndView("redirect:/items");
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/items");
		
	}
	
	
	
	
	@RequestMapping(value="/items", method = RequestMethod.GET)
	public ModelAndView listItems(@ModelAttribute("ItemGroupBean") ItemGroupBean itemGroupBean,@ModelAttribute("ItemsBean") ItemsBean itemsBean) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("items",  itemService.getAllItemGroups());
		
		List<String> glassList=new ArrayList<>();
		glassList.add("Yes");
		glassList.add("No");
		
		
		model.put("glassList", glassList);
		return new ModelAndView("items_list", model);
	}
	
	
	@RequestMapping(value = "/saveNewItem", method = RequestMethod.POST)
	public ModelAndView saveGroupItems(@ModelAttribute("ItemsBean") ItemsBean itemsBean, 
			BindingResult result) {
		
		
		try {
			itemService.saveGroupItems(itemsBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/items");
		
	}
	
	
}
