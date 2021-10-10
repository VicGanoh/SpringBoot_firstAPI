package com.vicgan.RestFulApi.CourseAPI.Controller;

import com.vicgan.RestFulApi.TopicAPI.Model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vicgan.RestFulApi.CourseAPI.Model.Course;
import com.vicgan.RestFulApi.CourseAPI.Service.CourseService;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    // inject course service
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    //Get A Course
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String topicId, @PathVariable String id){
        return courseService.getCourse(id);
    }

    // add a course
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    // UPDATE A COURSE
    @RequestMapping(method = RequestMethod.PUT, value = "topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    // DELETE COURSE
    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id, @PathVariable String topicId){
        courseService.deleteCourse(id);
    }
}
