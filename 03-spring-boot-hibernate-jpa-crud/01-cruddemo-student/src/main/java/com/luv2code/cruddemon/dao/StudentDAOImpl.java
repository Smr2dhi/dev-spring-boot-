package com.luv2code.cruddemon.dao;

import com.luv2code.cruddemon.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public class StudentDAOImpl implements StudentDAO {

//define field for entity manaager
    private EntityManager entityManager;

    //inject entity manager using constructor injection

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
entityManager.persist (theStudent);
    }

}
