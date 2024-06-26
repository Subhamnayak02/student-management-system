package com.student.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.sms.entity.Student;
import com.student.sms.repository.StudentRepository;
import com.student.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    
	private StudentRepository studentReposiory;
	
	public StudentServiceImpl(StudentRepository studentReposiory) {
		super();
		this.studentReposiory = studentReposiory;
	}

	@Override
	public List<Student> getallStudents() {
		// TODO Auto-generated method stub
		return studentReposiory.findAll();
		
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentReposiory.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentReposiory.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentReposiory.save(student);
	}

	@Override
	public void deleteStudentbyId(Long id) {
		// TODO Auto-generated method stub
		studentReposiory.deleteById(id);
	}
	
      
}
