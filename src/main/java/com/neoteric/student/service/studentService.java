package com.neoteric.student.service;

import com.neoteric.student.model.studentEntity;
import com.neoteric.student.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    studentRepository studentRepository;

    public List<studentEntity> getStudent(){
        return studentRepository.findAll();
    }
}
