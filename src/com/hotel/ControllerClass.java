package com.hotel;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass {
	@Autowired
	usersDAO dao;
	@RequestMapping("/")  
	    public String display()  
	    {  
	        return "index";  
	    }  
	 @RequestMapping("/addUser")    
	    public String showform(Model m){    
	        m.addAttribute("u", new Users());  
	        return "addUser";   
	    } 
	@RequestMapping(value="/add",method = RequestMethod.POST)    
    public String add(@Valid @ModelAttribute("u") Users u,BindingResult br,Model m){    
		 
		if(br.hasErrors())
       {
    	   return "addUser";  
       }
       
		dao.saveUsers(u); 
		m.addAttribute("name", u.getName());
        return "success";
       
    }  

}
