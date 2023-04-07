package com.example.hibernatejpa.DAO;

import com.example.hibernatejpa.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentImpl implements StudentDAO{
    private EntityManager entityManager;

    public StudentImpl(EntityManager entityManager){

        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Student theStudent) {
         entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
       return entityManager.find(Student.class,id);
    }
}
