package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository prodrepo;
	
	
	 @Autowired
	 UserRepository userrepo;
	 
	
	@RequestMapping("/")
	public List<Product>getList()
	{
		List<Product> products =prodrepo.findByOrderByName();
		return products;
		
	}
	@RequestMapping("/name/{name1}")
	public List<Product>getListBycompany(@PathVariable (value="name1")String name1)
	{
		return prodrepo.findByname(name1);
		
	}
	@RequestMapping("/price/{price1}")
	public List<Product>getListByprice(@PathVariable (value="price1")double price1)
	{
		return prodrepo.findByprice(price1);
		
	}
	
	
	 @RequestMapping("/users/{firstName}/{lastName}")
	 
	  public User getuserbyname(
	 
	 @PathVariable (value="firstName")String firstName,
	 
	 @PathVariable(value="lastName")String lastName) 
	 {
		 User user=userrepo.findByfirstNameAndLastNameLike(firstName,lastName); 
		 return user;
	 
	}
	 
	 
	
	
}
