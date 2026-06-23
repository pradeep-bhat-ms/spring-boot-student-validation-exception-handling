package com.example.FormValidation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FormValidation.Entity.Student;
import com.example.FormValidation.Exception.StudentNotFoundException;
import com.example.FormValidation.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public Student getStudentById(int id) {
		
		 return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));			
		}
	public Student updateStudent(int id, Student student) {

	    Student existingStudent = repo.findById(id)
	            .orElseThrow(() ->
	                    new StudentNotFoundException(
	                            "Student not found with id: " + id));

	    existingStudent.setName(student.getName());
	    existingStudent.setEmail(student.getEmail());
	    existingStudent.setCourse(student.getCourse());
	    existingStudent.setAge(student.getAge());

	    return repo.save(existingStudent);
	}

	public String deleteStudent(int id) {

	    Student existingStudent = repo.findById(id)
	            .orElseThrow(() ->
	                    new StudentNotFoundException(
	                            "Student not found with id: " + id));

	    repo.delete(existingStudent);

	    return "Student Deleted Successfully";
	}
	}

