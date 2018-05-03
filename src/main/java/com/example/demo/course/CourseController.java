package com.example.demo.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/getCourses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}
	
	@GetMapping("/getOneCourse/{id}")
	public Course getOneCourse(@PathVariable String id) {
		return courseService.getOneCourse(id);
	}
	
	@PostMapping("/addCourse/{topicId}/{courseId}")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
