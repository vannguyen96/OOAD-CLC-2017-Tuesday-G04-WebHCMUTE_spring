package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class navigationbarcontroller {
	//trang home
	@RequestMapping(value = "home.jsp", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response, ModelMap model)
	{
		
		return "redirect:/home.jsp";
	}
}
