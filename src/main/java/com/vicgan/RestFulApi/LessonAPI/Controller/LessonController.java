package com.vicgan.RestFulApi.LessonAPI.Controller;

import com.vicgan.RestFulApi.CourseAPI.Model.Course;
import com.vicgan.RestFulApi.LessonAPI.Service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vicgan.RestFulApi.LessonAPI.Model.Lesson;

import java.util.List;
import java.util.Optional;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    // GET
    @GetMapping("topics/{id}/courses/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String id, @PathVariable String courseId){
        return lessonService.getAllLessons(courseId);
    }

    //GET
    @GetMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public Optional<Lesson> getLesson(@PathVariable String topicId, @PathVariable String courseId, @PathVariable String id){
        return lessonService.getLesson(id);
    }


    // POST
    @PostMapping( "topics/{topicId}/courses/{courseId}/lessons")
    public void addLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId){
       // lesson.setTopic(new Topic(topicId,"",""));
        lesson.setCourse(new Course(courseId,"","",""));
        lessonService.addLesson(lesson);
    }

    // UPDATE
    @PutMapping( "/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId, @PathVariable Long id ){
        lesson.setCourse(new Course(courseId,"","", ""));
        //lesson.setTopic(new Topic(topicId,"",""));
        lessonService.updateLesson(lesson);
    }

    // DELETE
    @DeleteMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void deleteLesson(@PathVariable String id, @PathVariable String courseId, @PathVariable String topicId){
        lessonService.deleteLesson(id);
    }


}
