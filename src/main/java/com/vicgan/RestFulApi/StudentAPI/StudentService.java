package com.vicgan.RestFulApi.StudentAPI;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    public ArrayList<Student> registerStudent() {
        ArrayList<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student("Addy", "CSC", 1));
        listOfStudent.add(new Student("Victor", "CSC", 2));

        return listOfStudent;
    }
//       return listOfStudent.stream()
//                .filter(stu -> stu.getIndexNumber() == index)
//                .findFirst()
//               .orElse(null);
//        for (Student stu : listOfStudent){
//            if (stu.getIndexNumber() == index)
//                return stu;
//        }
//       return  null;

        public Student getStudentById(int id){
            ArrayList<Student> listOfStudent_ = new ArrayList<>();
            listOfStudent_.add(new Student("Addy", "CSC", 1));
            listOfStudent_.add(new Student("Victor", "CSC", 2));

            for (Student stu : listOfStudent_) {
                if (stu.getIndexNumber() == id)
                    return stu;
            }
            return null;

    }
    

}
