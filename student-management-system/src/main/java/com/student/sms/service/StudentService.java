package com.student.sms.service;

import java.util.List;

import com.student.sms.entity.Student;

public interface StudentService {
     List<Student> getallStudents();
     Student saveStudent(Student student);
     
     Student getStudentById(Long id);
     
     Student updateStudent(Student student);
     
     void deleteStudentbyId(Long id);
}
