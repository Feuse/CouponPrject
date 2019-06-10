package com.example.CouponProjectCore.entity;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="coupon")
public class Coupon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String title;
	@Column(name="startDate")
	private String startDate;
	@Column(name="endDate")
	private String endDate;
	@Column(name="amount")
	private int amount; //decrease ammount on ever customer purchase
	@Column(name="couponType")
	private CouponType couponType;
	@Column(name="message")
	private String message;
	@Column(name="price")
	private double price;
	@Column(name="image")
	private String image;

	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToMany
	private List<Customer> customer;
	

	
	public Coupon() {
		
	}


	public CouponType getCouponType() {
		return couponType;
	}


	public void setCouponType(CouponType couponType) {
		this.couponType = couponType;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}

	
	

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amount=" + amount + ", type=" + ", message=" + message + ", price=" + price + ", image="
				+ image + "]";
	}
	
	
}
