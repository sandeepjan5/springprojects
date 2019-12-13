package boot.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import boot.jpa.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired	
	LoginService loginService;	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model)
	{
		return "login";
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name,@RequestParam String password)
	{
		boolean isValidUser = loginService.validateUser(name,password);
		
		if(!isValidUser)
		{
			model.put("errormessage", "invalid credentials");
		}
		
		model.put("name", name);
		model.put("password", password);
		
		return "welcome";
	}

}
