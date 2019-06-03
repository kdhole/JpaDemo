package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
public  List<Product>findByOrderByName();
public List<Product>findByname(String name);
public List<Product>findByprice(double price);
}
