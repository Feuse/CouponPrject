package com.example.CouponProjectCore.customerDAO;

import java.util.Set;

import com.example.CouponProjectCore.entity.CustomerCoupon;

public interface CustomerCouponDAO {
	
	public void createCustomerCoupon(long custId, long couponId) ;
	public void removeCustomerCoupon(long custId, long couponId);
	public Set<CustomerCoupon> getCustomerCoupon(long coupId) ;
	

}
