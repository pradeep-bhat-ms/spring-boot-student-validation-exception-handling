package com.example.FormValidation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters")
	private String name;
	
	@Email(message="Enter valid email")
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message="course is requried")
	private String course;
	
	@Min(value=18, message="minimum age is 18")
	@Max(value=30, message="maximum age is 30")
	private int age;
}
