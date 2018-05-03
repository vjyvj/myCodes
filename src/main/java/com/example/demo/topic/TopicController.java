package com.example.demo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	@GetMapping("/getTopics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@GetMapping("/getOneTopic/{id}")
	public Topic getOneTopic(@PathVariable String id) {
		return topicService.getOneTopic(id);
	}
	
	@PostMapping("/addTopic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@DeleteMapping("/deleteTopic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
