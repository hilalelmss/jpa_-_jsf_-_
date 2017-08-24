package HelloSpring.com.hilal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(path = "/main")
public class MainController {
	@GetMapping(path = "/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
}
