package com.example.CouponProjectCore.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CouponProjectCore.customerDAO.CompanyDAO;
import com.example.CouponProjectCore.customerService.CompanyService;
import com.example.CouponProjectCore.customerService.CouponService;
import com.example.CouponProjectCore.entity.Company;
import com.example.CouponProjectCore.entity.Coupon;
import com.example.CouponProjectCore.entity.CouponType;
import com.example.CouponProjectCore.entity.Customer;

@Controller
@RequestMapping("/company")
public class CompanyController  {
	
	CompanyService companyService;
	CouponService couponService;
	
	@Autowired
	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}
	
	@GetMapping("/showAllCompany")
	public String findAll(Model theModel) {
		List<Company> companies = companyService.findAll();	
		System.out.println(companies);
		theModel.addAttribute("companies", companies);
	return "showAllCompanies";
	
	}
	
	@PostMapping("/company")
	public String save(@ModelAttribute Company company,Model theModel) {
		System.out.println
		("inside save company method");
		System.out.println(company);
		company.setId(0);
		companyService.save(company);
		System.out.println(company);
		theModel.addAttribute("company",company);
		System.out.println(company);
		return "savedCompany";
	}
	
	@PostMapping("/create")
	public String createNewCoupon(@ModelAttribute("coupon") Coupon coupon,Model theModel) {
		
		coupon.setId(0);
		
	
		System.out.println(coupon.getEndDate());
		System.out.println(coupon);
		System.out.println("test");
		theModel.addAttribute("coupon",coupon);
		couponService.save(coupon);
	
		return "savedCoupon";
	}
	
	
}
