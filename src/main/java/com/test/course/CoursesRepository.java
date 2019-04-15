package com.test.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CoursesRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);

}
