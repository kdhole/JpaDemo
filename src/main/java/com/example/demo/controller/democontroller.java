package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Post;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;

@RestController
public class democontroller {
	
	@Autowired
	PostRepository postrepo;
	@Autowired 
	AuthorRepository authorepo;
	
	@RequestMapping("/posts")
	public List<Post> getPosts(){
		List<Post> posts = (List<Post>) postrepo.findAll();
	
		return posts;
	}
	@RequestMapping("/get")
	public List<Author> getList(){
		List<Author> posts = (List<Author>) authorepo.findAll();
	
		return posts;
	}
	
	
	
	
}
