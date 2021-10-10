package com.vicgan.RestFulApi.CourseAPI.Repository;

import org.springframework.data.repository.CrudRepository;
import com.vicgan.RestFulApi.CourseAPI.Model.Course;

import java.util.List;


public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String id);
   public List<Course> findCourseById(String id);


}
