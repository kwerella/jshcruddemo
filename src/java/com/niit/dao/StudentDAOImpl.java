/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.dao;

import com.niit.entity.Student;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;

/**
 *
 * @author MRuser
 */
@Transactional
public class StudentDAOImpl implements StudentDAO{

    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public List<Student> list() {
        return sessionFactory.getCurrentSession().createQuery("FROM Student").list();
    }

    @Override
    public Student get(int id) {
        return (Student) sessionFactory.getCurrentSession().get(Student.class, new Integer(id));
    }

    @Override
    public void add(Student student) {
        sessionFactory.getCurrentSession().persist(student);
    }

    @Override
    public void udpate(Student student) {
        sessionFactory.getCurrentSession().update(student);
    }

    @Override
    public void delete(Student student) {
        sessionFactory.getCurrentSession().delete(student);
    }
    
}
