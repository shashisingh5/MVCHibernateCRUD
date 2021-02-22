package com.hotel;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class usersDAO {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save users  
	@Transactional
	public void saveUsers(Users u){ 
		 
		    u.getCity();u.getEmailid();u.getLandmark();
		    u.getName();u.getPhoneno();u.getPincode();u.getState();
		    u.getUserid();   
	    template.save(u);  
	}  

}
