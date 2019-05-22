package com.example.demo.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicrepository;
	
	
	public List<Topic> getAll() {
		List<Topic> allList = new ArrayList<>();
		topicrepository.findAll().forEach(t->allList.add(t));
		return allList;
		
	}
	
	public Topic getTopic(String id) {
		
		return topicrepository.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		
		topicrepository.save(topic);		
	}

	public void updateTopic(Topic topic, String id) {
		topicrepository.save(topic);		
		
	}

	public void deleteTopic(String id) {
		topicrepository.deleteById(id);;		

	}

}
