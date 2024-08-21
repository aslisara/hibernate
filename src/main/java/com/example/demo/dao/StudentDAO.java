package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student thestudent);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastname);


    void update(Student student);

    void delete(Integer id);

    int deleteAll();
}