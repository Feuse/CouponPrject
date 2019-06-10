package com.example.CouponProjectCore.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CouponController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/leaders")
	public String showLeaders() {
		return "leaders";
	}
	
	@GetMapping("/system")
	public String showSystem() {
		return "system";
	}
	
	@GetMapping("/show")
	public String show() {
		return "show";
	}
	
	@GetMapping("/showOne")
	public String showONe() {
		return "showOne";
	}
	
}
