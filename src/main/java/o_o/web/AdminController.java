package o_o.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import o_o.model.JsonModel;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{

	
	@RequestMapping(value="/register")
	public String regidter(HttpServletRequest request, HttpServletResponse response, String userName, String password)
	{
		return "register";
	}
	
	
	
	@RequestMapping(value="/test")
	public String test(HttpServletRequest request, HttpServletResponse response)
	{
		return "index";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/testJSON")
	public JsonModel testJSON(HttpServletRequest request, HttpServletResponse response, JsonModel jm)
	{
		return jm;
	}
	
	@ResponseBody
	@RequestMapping(value="/testJSONt")
	public JsonModel testJSONt(HttpServletRequest request, HttpServletResponse response, @RequestBody JsonModel jm)
	{
		return jm;
	}
	
}
