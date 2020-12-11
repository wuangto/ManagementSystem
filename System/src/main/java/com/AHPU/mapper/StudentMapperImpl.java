package com.AHPU.mapper;

import com.AHPU.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentMapperImpl  implements StudentMapper {
    private SqlSessionTemplate sqlSession;


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
    public int addStudent(Student student) {

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        mapper.addStudent(student);


        return 0;
    }

    public int delStudent(String ID) {

        sqlSession.getMapper(StudentMapper.class).delStudent(ID);
        return 0;
    }

    public int alterStudent(Student student) {
        sqlSession.getMapper(StudentMapper.class).alterStudent(student);
        return 0;
    }

    public List<Student> getStudentList() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        return mapper.getStudentList();

    }

    public Student searchStudent(String ID) {
        return sqlSession.getMapper(StudentMapper.class).searchStudent(ID);

    }
}
