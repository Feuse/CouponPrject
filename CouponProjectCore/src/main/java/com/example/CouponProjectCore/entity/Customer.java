package com.example.CouponProjectCore.entity;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="cust_name")
	@Size(min=1,message="is required")
	private String cust_name;
	@Column(name="password")
	@Size(min = 1, message = "is required")
	private String password;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Coupon> coupons;
//	@Column(name="clientType")
//	private ClientType clientType;
	
	public Customer() {
		
	}

	public Customer(int id, String cust_name, String password) {
		this.id = id;
		this.cust_name = cust_name;
		this.password = password;
//		this.coupons = coupons;
//		this.clientType = clientType;
	}

//	public Collection<Coupon> getCoupons() {
//		return coupons;
//	}

//	public void setCoupons(Collection<Coupon> coupons) {
//		this.coupons = coupons;
//	}

//	public ClientType getClientType() {
//		return clientType;
//	}

//	public void setClientType(ClientType clientType) {
//		this.clientType = clientType;
//	}
	
	

	public int getId() {
		return id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + cust_name + ", password=" + password + "]";
	}
}
