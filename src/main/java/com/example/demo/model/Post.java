package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post {
	@Id
	@GeneratedValue
private Long id;
	/*
	 * public Post(Long id, String title, String body, Date postedOn, Author author)
	 * { super(); this.id = id; this.title = title; this.body = body; this.postedOn
	 * = postedOn; this.author = author; }
	 */
private String title;
@Override
public String toString() {
	return "Post [id=" + id + ", title=" + title + ", body=" + body + ", postedOn=" + postedOn + ", author=" + author
			+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getBody()=" + getBody() + ", getPostedOn()="
			+ getPostedOn() + ", getAuthor()=" + getAuthor() + "]";
}
private String body;
private Date postedOn;
@JsonBackReference
@ManyToOne
private Author author;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public Date getPostedOn() {
	return postedOn;
}
public void setPostedOn(Date postedOn) {
	this.postedOn = postedOn;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
private Post()
{
	
}
}
