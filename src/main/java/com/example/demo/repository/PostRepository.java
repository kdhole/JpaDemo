package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Author;
import com.example.demo.model.Post;

public interface PostRepository extends CrudRepository<Post,Long> {

}
