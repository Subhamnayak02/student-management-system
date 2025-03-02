package com.student.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.sms.entity.Student;
import com.student.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student std1 = new Student("subham","nayak","gg");
//		studentRepository.save(std1);
//		Student std2 = new Student("sahil","kummar","trd");
//		studentRepository.save(std2);
	}

}
