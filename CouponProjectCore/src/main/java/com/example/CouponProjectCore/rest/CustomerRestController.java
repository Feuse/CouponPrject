package com.example.CouponProjectCore.rest;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CouponProjectCore.customerDAO.CustomerDAO;
import com.example.CouponProjectCore.customerService.CustomerService;
import com.example.CouponProjectCore.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerRestController{
	
	
	CustomerService customerService;
	
	@Autowired
	public CustomerRestController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/show")
	public String findAll(Model theModel) {
		List<Customer> customers = customerService.findAll();	
		theModel.addAttribute("customers", customers);
	return "show";
	}

	@GetMapping("customers/{id}")
	public String findById(@RequestParam int id, Model theModel) {
		//need to test for NULL somewhere
		Customer customer = customerService.getOne(id);
		theModel.addAttribute("customer", customer);
		
		return "showOne";
	}

	@PostMapping("/customer")
	public String save(@ModelAttribute Customer customer,Model theModel) {
		customer.setId(0);
		customerService.save(customer);
		theModel.addAttribute("customer",customer);
		return "saved";
	}
	
	@PostMapping("/purchaseCoupon")
	public String purchaseCoupon() {
		
		return "verifyPurchase";
	}
}
