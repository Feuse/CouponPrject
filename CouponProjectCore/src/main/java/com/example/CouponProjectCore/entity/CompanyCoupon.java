package com.example.CouponProjectCore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_coupon")
public class CompanyCoupon {

	@Id
	private long compCoupId;
	@Column(name="compId")
	private long Comp_id;
	@Column(name="couponId")
	private long Coupon_id;

	
	
	public CompanyCoupon(long compCoupId, long comp_id, long coupon_id) {
		super();
		this.compCoupId = compCoupId;
		Comp_id = comp_id;
		Coupon_id = coupon_id;
	}

	public long getCompCoupId() {
		return compCoupId;
	}

	public void setCompCoupId(long compCoupId) {
		this.compCoupId = compCoupId;
	}

	public long getComp_id() {
		return Comp_id;
	}

	public void setComp_id(long comp_id) {
		Comp_id = comp_id;
	}

	public long getCoupon_id() {
		return Coupon_id;
	}

	public void setCoupon_id(long coupon_id) {
		Coupon_id = coupon_id;
	}

	public CompanyCoupon(long comp_id, long coupon_id) {
		super();
		Comp_id = comp_id;
		Coupon_id = coupon_id;
	}

	public CompanyCoupon() {
		super();
	}

	@Override
	public String toString() {
		return "Company_Coupon [Comp_id=" + Comp_id + ", Coupon_id=" + Coupon_id + "]";
	}

}