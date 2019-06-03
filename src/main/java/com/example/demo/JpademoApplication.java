package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;

@SpringBootApplication

public class JpademoApplication {

	@Autowired 
	PostRepository postrepo;
	
	@Autowired 
	AuthorRepository authorepo;
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}
@PostConstruct
void printPosts()
{
	Author author=new Author("jaya","bacchan");
	authorepo.save(author);
	
}

	
}
