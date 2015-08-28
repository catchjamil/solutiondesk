package com.sd.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sd.app.bean.masters.Units;
import com.sd.app.constraint.Status;

@Repository("getMasterDataEngine")
public class GetMasterDataEngineImp implements GetMasterDataEngine{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<Units> listUnits() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		List<Units> listEmp = null;
		try{
		System.out.println("currentSession : "+currentSession);
		 listEmp = (List<Units>)currentSession.createCriteria(Units.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return listEmp;
		//return (List<Employee>) currentSession.createQuery("FROM Employee WHERE status!='"+Status.DELETE+"'").list();
		
	}
	
	
}
