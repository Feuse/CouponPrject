package com.example.CouponProjectCore.customerDAO;

import java.util.Set;
import com.example.CouponProjectCore.entity.CompanyCoupon;

public interface CompanyCouponDAO {
	
	void createCompany_Coupon(long compId, long coupId);
	Set<CompanyCoupon> getAll();
	void removeCompany_CouponByCompId(Long compId);
	void removeCompany_CouponByCouponId(Long coupId);
	
}