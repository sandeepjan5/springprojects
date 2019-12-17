package boot.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController 
{
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("hello");
		return "Home";
	}

}
