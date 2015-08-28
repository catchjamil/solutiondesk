package com.sd.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sd.app.bean.GenerateQuotationBean;
import com.sd.app.bean.masters.Units;
import com.sd.app.dao.GetMasterDataEngine;


@Controller
public class GenerateQuotationController {
	
	GenerateQuotationBean GenerateQuotationBean = new GenerateQuotationBean();
	@Autowired
	private GetMasterDataEngine getMasterDataEngine;
    
	@RequestMapping(value="/generateQuotation", method = RequestMethod.GET)
	public ModelAndView displayQuatationPage() {
		ModelAndView model = new ModelAndView();
		System.out.println("welcome in generate queation...");
		
		GenerateQuotationBean.setListUnits(getMasterDataEngine.listUnits());
		
		model.addObject("generateQuotationBean", GenerateQuotationBean);
		model.setViewName("generateQuotation");
		return model;
	}
}	
	