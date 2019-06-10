package com.example.CouponProjectCore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_coupon")
public class CustomerCoupon {
	
	@Id
	private long custCouponId;
	@Column(name="custId")
	private long custId;
	@Column(name="coupId")
	private long coupId;
	
	
	
	public CustomerCoupon(long custCouponId, long custId, long coupId) {
		super();
		this.custCouponId = custCouponId;
		this.custId = custId;
		this.coupId = coupId;
	}
	public long getCustCouponId() {
		return custCouponId;
	}
	public void setCustCouponId(long custCouponId) {
		this.custCouponId = custCouponId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getCoupId() {
		return coupId;
	}
	public void setCoupId(long coupId) {
		this.coupId = coupId;
	}
	@Override
	public String toString() {
		return "CustomerCoupon [custId=" + custId + ", coupId=" + coupId + "]";
	}
	
	
	
	

}
