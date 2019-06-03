package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Author {
@Id
@GeneratedValue
	private Long id;
	private String firstnmae;
	private Author() {}
	public Author(String firstnmae, String lastname) {
		super();
		this.firstnmae = firstnmae;
		this.lastname = lastname;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstnmae() {
		return firstnmae;
	}

	public void setFirstnmae(String firstnmae) {
		this.firstnmae = firstnmae;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public Author(Long id, String firstnmae, String lastname, List<Post> posts) {
		super();
		this.id = id;
		this.firstnmae = firstnmae;
		this.lastname = lastname;
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstnmae=" + firstnmae + ", lastname=" + lastname + ", posts=" + posts
				+ ", getId()=" + getId() + ", getFirstnmae()=" + getFirstnmae() + ", getLastname()=" + getLastname()
				+ ", getPosts()=" + getPosts() + "]";
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	private String lastname;
	@JsonManagedReference
	@OneToMany(mappedBy="author")
	private List <Post>posts;
}
