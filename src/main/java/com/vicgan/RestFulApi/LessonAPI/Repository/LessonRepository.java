package com.vicgan.RestFulApi.LessonAPI.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vicgan.RestFulApi.LessonAPI.Model.Lesson;

import java.util.List;
import java.util.Optional;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, String> {

    public List<Lesson> findByCourseId(String CourseId);

    Optional<Lesson> findLessonById(String id);

}
