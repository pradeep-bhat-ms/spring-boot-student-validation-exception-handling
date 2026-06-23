	package com.example.FormValidation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FormValidation.Entity.Student;
import com.example.FormValidation.Service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	@PostMapping("/save")
	public Object saveStudent(@Valid @RequestBody Student student) {
		return service.saveStudent(student);
	}
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
	    return service.getStudentById(id);
	}
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id,
	                             @Valid @RequestBody Student student) {
	    return service.updateStudent(id, student);
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
	    return service.deleteStudent(id);
	}
	

}
