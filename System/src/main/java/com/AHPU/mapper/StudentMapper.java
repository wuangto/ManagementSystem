package com.AHPU.mapper;

import com.AHPU.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int addStudent(Student student);
    int delStudent(String ID);
    int alterStudent(Student student);
    List<Student>  getStudentList();
    Student searchStudent(String ID);
}
