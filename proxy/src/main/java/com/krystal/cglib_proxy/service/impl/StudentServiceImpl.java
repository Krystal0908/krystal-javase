package com.krystal.cglib_proxy.service.impl;

import com.krystal.cglib_proxy.Student;
import com.krystal.cglib_proxy.service.IStudentService;

/**
 * @author krystal
 * @create 2023-09-05 1:04
 */
public class StudentServiceImpl implements IStudentService {
    public void save(Student student) {
        System.out.println("保存学生信息");
    }

    public Student query(Long id){
        System.out.println("查询操作");
        Student student =new Student();
        student.setName("sy");
        student.setAge(18);
        return student;
    }
}
