package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.example.demo.course.Course;

@Entity
public class Topic {

	@Id
	private String id;
	@Size(min=2)
	private String name;
	private String description;
	
	public Topic() {
		
	}

	public Topic(String topicId, String name, String description) {
		this.id = topicId;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
