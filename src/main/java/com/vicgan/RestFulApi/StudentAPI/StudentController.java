package com.vicgan.RestFulApi.StudentAPI;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class StudentController {
    StudentService studentService;


    // Get a specific student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }


    // Get all students
    @GetMapping("/student")
    public ArrayList<Student> getStudents(){
        return studentService.registerStudent();
    }
}

