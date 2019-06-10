package com.example.CouponProjectCore.entity;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="comp_name")
	private String comp_name;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@OneToMany
	private Set<Coupon> coupons;
	
//	@Column(name="clientType")
//	private ClientType clientType;
	
	public Company() {
		
	}

	public Company(long id, String comp_name, String password, String email, Set<Coupon> coupons) {
		super();
		this.id = id;
		this.comp_name = comp_name;
		this.password = password;
		this.email = email;
		this.coupons = coupons;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Coupon> getCoupons() {
		return coupons;
	}
	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}
//	public ClientType getClientType() {
//		return clientType;
//	}
//	public void setClientType(ClientType clientType) {
//		this.clientType = clientType;
//	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", comp_name=" + comp_name + ", password=" + password + ", email=" + email
				 + "]";
	}
	
}



