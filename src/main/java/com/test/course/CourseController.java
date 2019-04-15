package com.test.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService = new CourseService();
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id, @RequestBody Course course) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void updateCourse(@PathVariable String topicId, @RequestBody Course course){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String topicId){
		courseService.deleteCourse(topicId);
	}
}
