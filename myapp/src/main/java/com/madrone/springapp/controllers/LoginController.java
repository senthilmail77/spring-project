package com.madrone.springapp.controllers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.madrone.springapp.forms.LoginForm;
import com.madrone.springapp.validators.LoginValidator;

@Controller
public class LoginController {
	private static final Logger logger = 
			LoggerFactory.getLogger(LoginController.class);

	LoginValidator loginValidator;

	@Autowired
	public LoginController(LoginValidator loginValidator) {
		this.loginValidator = loginValidator;
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("LoginForm") LoginForm login,
			BindingResult result) {
 
		checkData();
		loginValidator.validate(login, result);
		if (result.hasErrors()) {
			logger.info("Error in Form");
		} else {
			logger.info("Success");
		}

		return "login";
	}

	private void checkData() {
		 AnnotationConfiguration cfg = new AnnotationConfiguration();
		 cfg.configure("hibernateContext.xml");//populates the data of the configuration file
		 
		  //creating seession factory object  
		    
		    try {
				SessionFactory factory= cfg.buildSessionFactory();  
				
	  //creating session object  
				Session session=factory.openSession();  
				  
				//creating transaction object  
				
				System.out.println("successfully...");
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		
		 
		 
		 
		
	}

}
