package com.test.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	@Autowired
	TopicsRepository topicsRepository;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<Topic>();
		topicsRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		//topicsRepository.findById(id);
		return topicsRepository.getTopicById(id);
	}
	
	public void addTopic(Topic topic)
	{
		topicsRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic)
	{
		topicsRepository.save(topic);
	}
	
	public void deleteTopic(String id)
	{
		topicsRepository.deleteById(id);
	}
}
