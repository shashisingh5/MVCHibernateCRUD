package com.hotel;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	        m.addAttribute("d", new Users());
	        
	        return "addUser";   
	    } 
	 
	@RequestMapping(value="/add",params = "save",method = RequestMethod.POST)    
    public String add(@Valid @ModelAttribute("u") Users u, BindingResult br,Model m){    
		 
		if(br.hasErrors())
       {
			
	       m.addAttribute("d", new Users());
	        
    	   return "addUser";  
       }
       
		dao.saveUsers(u); 
		m.addAttribute("name", u.getName());
        return "success";
       
    } 
	
	@RequestMapping(value="/delete",params = "dt",method = RequestMethod.POST)    
    public String deleteuser(@Valid @ModelAttribute("d") Users u, BindingResult brd,Model m){    
		 
		if(brd.hasErrors())
	       {
			m.addAttribute("u", new Users()); 
	       
	       
	    	   return "addUser";  
	       }
		dao.deleteUsers(u.getUserid()); 
		m.addAttribute("userid", u.getUserid());
        return "success";
       
    }  
	@RequestMapping(value="/listdata",params = "lu",method = RequestMethod.POST)    
    public ModelAndView listdata(Model m){    
		m.addAttribute("u", new Users()); 
        m.addAttribute("d", new Users());
        
		
		List<Users> l=dao.listdata(); 
		ModelAndView model = new ModelAndView("addUser");
		
			System.out.println(l);
		
        model.addObject("lists", l);

		
        return model;
       
    } 

}
