package com.vicgan.RestFulApi.LessonAPI.Model;

import com.vicgan.RestFulApi.CourseAPI.Model.Course;

import javax.persistence.*;

@Entity
public class Lesson {

    @Id
    private String id;
    private String name;

    @ManyToOne
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lesson(){}

    public Lesson(String id, String name, String courseId){
        super();
        this.id = id;
        this.name = name;
        this.course = new Course(courseId, "", "","");
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
