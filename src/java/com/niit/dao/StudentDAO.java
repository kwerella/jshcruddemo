/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.dao;

import com.niit.entity.Student;
import java.util.List;

/**
 *
 * @author MRuser
 */
public interface StudentDAO {
    List<Student> list();
    Student get(int id);
    void add(Student student);
    void udpate(Student student);
    void delete(Student student);    
}
