package helloSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping("/")
	public String onIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/go", method = RequestMethod.POST)
	public ModelAndView andView() {
		return new ModelAndView("true", "obj", "yeeee");
	}
}
