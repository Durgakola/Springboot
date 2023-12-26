package com.neoteric.student.repository;

import com.neoteric.student.model.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<studentEntity,Integer> {


}
