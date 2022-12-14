package com.springoauthservice;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
   @Autowired
	UserService userService;
	
   @RequestMapping("/home")
	public String home(){
		return "home.jsp";
	}
	
   @RequestMapping("/login")
	public String loginPage(){
		return "login.jsp";
	}
   
   @RequestMapping("/logout-success")
	public String logoutPage(){
		return "logout.jsp";
	}
	@ResponseBody
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
		
	}
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
		
	}
}
