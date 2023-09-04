package com.krystal.cglib_proxy.service;

import com.krystal.cglib_proxy.Student;

/**
 * @author krystal
 * @create 2023-09-05 1:04
 */
public interface IStudentService {
    /**
     * 添加学生
     */
    void save(Student student);

    /**
     * 查询学生信息
     * @param id
     * @return
     */
    Student query(Long id);
}
