package com.neoteric.student.controller;

import com.neoteric.student.model.studentEntity;
import com.neoteric.student.service.SchoolService;
import com.neoteric.student.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    studentService studentService;

    //end point
    @GetMapping(value = "/getStudents")
    public List<studentEntity> getStudent() {
        return studentService.getStudent();
    }

    @GetMapping(value = "/getTeacherCount")
    public int getTeacherCount(){
        SchoolService s =new SchoolService();
        return  s.getTeacherCount();
    }

    @GetMapping(value = "/getremoveTeacher")
    public int getremoveTeacher() {
        SchoolService s = new SchoolService();
        return s.getremoveTeacher();
    }

    @GetMapping(value = "/getaddTeacher")
    public int getaddTeacher() {
        SchoolService s = new SchoolService();
        return s.getaddTeacher();
    }

}
