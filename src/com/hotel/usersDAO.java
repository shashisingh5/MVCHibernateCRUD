package com.hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.ColumnMapRowMapper;
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
		   
	    template.save(u);  
	}
	@Transactional
	public void deleteUsers(int userid) {
		Users u = new Users();
	    u.setUserid(userid);
		template.delete(u);
		
	}
	@Transactional
	public List<Users> listdata() {
	    List<Users> list=new ArrayList<Users>();  
	    list=template.loadAll(Users.class); 
		return list;
		
	}  
}
