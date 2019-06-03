package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Product {
	
	public Product( int id, String name, String manufacturer, double price, String catagory,
			Date mfgDate) {
		super();
		
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.catagory = catagory;
		this.mfgDate = mfgDate;
	}
	public Product()
	{
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price
				+ ", catagory=" + catagory + ", mfgDate=" + mfgDate + "]";
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Id
	@GeneratedValue
private int id;
public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public Date getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
private String name;
private String manufacturer;
private double price;
private String catagory;
private Date mfgDate;

}
