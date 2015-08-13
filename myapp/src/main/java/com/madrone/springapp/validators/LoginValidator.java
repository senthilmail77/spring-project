package com.madrone.springapp.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.madrone.springapp.forms.LoginForm;

@Component
public class LoginValidator implements Validator {
	
	
	@Override
	public void validate(Object object, Errors errors) {
		System.out.println("Inside Validator....");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "login.username.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "login.password.empty");
		
		
	}

	@Override
	public boolean supports(Class<?> c) {
		return LoginForm.class.equals(c);
	}

}
