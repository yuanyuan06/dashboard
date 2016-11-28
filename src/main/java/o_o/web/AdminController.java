package o_o.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{

	
	@RequestMapping(value="/register")
	public String regidter(HttpServletRequest request, HttpServletResponse response, String userName, String password)
	{
		return "register";
	}
	
	
	
	@RequestMapping(value="/test")
	public @ResponseBody String test(HttpServletRequest request, HttpServletResponse response, int a, int b)
	{
		return "register";
	}
}