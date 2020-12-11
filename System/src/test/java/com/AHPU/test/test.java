package com.AHPU.test;

import com.AHPU.mapper.StudentMapper;
import com.AHPU.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);

        /*添加学生信息*/
        /*studentMapper.addStudent(new Student("王五","3170701113","计算机172","计算机与信息学院",
                "男","12","202","173****6078","安徽芜湖"));*/

        /*删除学生信息(根据学号删除)*/
        /*studentMapper.delStudent("3170701113");*/

        System.out.println(studentMapper.searchStudent("3170701111"));
        /*for(Student student:studentMapper.getStudentList()){
            System.out.println(student);
        }*/
    }
}
