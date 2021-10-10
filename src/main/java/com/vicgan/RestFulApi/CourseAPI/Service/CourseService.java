package com.vicgan.RestFulApi.CourseAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vicgan.RestFulApi.CourseAPI.Model.Course;
import com.vicgan.RestFulApi.CourseAPI.Repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    // inject course repository
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        //List<Course> courses = new ArrayList<>();
        return courseRepository.findByTopicId(topicId);
    }

    public Optional<Course> getCourse(String id){
        return courseRepository.findById(id);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }

}
