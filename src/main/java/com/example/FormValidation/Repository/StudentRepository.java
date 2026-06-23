package com.example.FormValidation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FormValidation.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
