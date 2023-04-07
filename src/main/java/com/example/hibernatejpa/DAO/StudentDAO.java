package com.example.hibernatejpa.DAO;

import com.example.hibernatejpa.entity.Student;

public interface StudentDAO {
     void save(Student theStudent);
    Student findById(Integer id);
}
