package com.vicgan.RestFulApi.LessonAPI.Service;

import com.vicgan.RestFulApi.LessonAPI.Repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vicgan.RestFulApi.LessonAPI.Model.Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId){
        return new ArrayList<>(lessonRepository.findByCourseId(courseId));
    }

    public Optional<Lesson> getLesson(String id){
        return lessonRepository.findLessonById(id);
    }

    public void addLesson(Lesson lesson){
       lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id){
        boolean exists = lessonRepository.existsById(id);
        if (!exists) {
            throw new IllegalArgumentException("Lesson with id: " + id + "does not exist");
        }
        lessonRepository.deleteById(id);
    }

}
