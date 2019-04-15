package com.test.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	CoursesRepository coursesRepository;
	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<Course>();
		coursesRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id)
	{
		return coursesRepository.findById(id).get();
	}
	
	public void addCourse(Course Course)
	{
		coursesRepository.save(Course);
	}
	
	public void updateCourse(Course Course)
	{
		coursesRepository.save(Course);
	}
	
	public void deleteCourse(String id)
	{
		coursesRepository.deleteById(id);
	}
}
