package com.neoteric.student.service;

public class SchoolService {

    private static int teacherCountinSchool=20;

    public SchoolService(){
        System.out.println("from SchoolService constructor teacherCount ="+teacherCountinSchool);
    }
    public int getTeacherCount(){
        return teacherCountinSchool;
    }
    public int getremoveTeacher(){

        return teacherCountinSchool=teacherCountinSchool-1;
    }

    public int  getaddTeacher() {

        return teacherCountinSchool=teacherCountinSchool+1;
    }
}
