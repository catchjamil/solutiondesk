package com.sd.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sd.app.bean.GenerateQuotationBean;
import com.sd.app.dao.GetMasterDataEngine;


@Controller
public class PartyController {
	
	GenerateQuotationBean GenerateQuotationBean = new GenerateQuotationBean();
	@Autowired
	private GetMasterDataEngine getMasterDataEngine;
    
	@RequestMapping(value="/addParty", method = RequestMethod.GET)
	public ModelAndView displayQuatationPage() {
		ModelAndView model = new ModelAndView();
		System.out.println("welcome in Add Party...");
//		model.addObject("generateQuotationBean", GenerateQuotationBean);
		model.setViewName("addParty");
		return model;
	}
}	
	