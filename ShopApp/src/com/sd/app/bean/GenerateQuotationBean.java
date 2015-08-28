package com.sd.app.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sd.app.bean.masters.Units;

public class GenerateQuotationBean {

	private List<Units> listUnits;
	private String quotationNo;
	private List<String> quotationType;
	
	public List<String> getQuotationType() {
		quotationType = new ArrayList<String>();
		quotationType.add("NORMAL");
		quotationType.add("BUDGETARY");
		return quotationType;
	}
	public void setQuotationType(List<String> quotationType) {
		this.quotationType = quotationType;
	}
	public List<Units> getListUnits() {
		return listUnits;
	}
	public void setListUnits(List<Units> listUnits) {
		this.listUnits = listUnits;
	}
	public String getQuotationNo() {
		
		Date date= new Date();
		System.out.println("month: "+date.getMonth());
		quotationNo = +date.getSeconds()+""+date.getMinutes()+""+date.getHours()+""+date.getDate()+""+date.getMonth()+""+date.getYear();
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		
	   
		this.quotationNo = quotationNo;
	}
	
}
