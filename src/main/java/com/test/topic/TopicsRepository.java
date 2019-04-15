package com.test.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicsRepository extends CrudRepository<Topic, String> {
	
	public Topic getTopicById(String id);

}
