package SpringbootApp.First_springboot;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/")
	public String home()
	{
		return "spring boot is working";
	}
@GetMapping("/actuatorExample")
public String example()
{
	return "Actuator is working" + new Date();
}

}
