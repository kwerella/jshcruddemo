/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.bean;

import com.niit.dao.StudentDAO;
import com.niit.entity.Student;
import java.util.List;

/**
 *
 * @author MRuser
 */
public class StudentCRUDBean {

    private StudentDAO studentDAO;
    
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
        
    // create all the CRUD operations below
    public void add() {    
        
        // before using DAO
        //student.setId((students.isEmpty())? 1 : students.get(students.size() - 1).getId() + 1);
        studentDAO.add(student);
        student = new Student();

    }
    
    public void resetAdd() {
        student = new Student();
    }
    
    public void edit(Student student) {    
        
        this.student = student;
        // before using DAO
        editStudent = true;
    }
               
    public void cancelEdit() {    
        
        // before using DAO
        editStudent = false;
    }

    public void saveEdit() {    
        
        // before using DAO 
        studentDAO.udpate(student);
        editStudent = false;
        student = new Student();
    }

    
    
    public void delete(Student student) {            
        studentDAO.delete(student);
        // before using DAO
        student = new Student();
    }
    
    
    
    // to provide the list of students
    private List<Student> students = null;
    // to provide a single student
    private Student student = new Student();
    // to check if edit option is selected
    private boolean editStudent;

    // getters and setters for the above fields
    public List<Student> getStudents() {
        return studentDAO.list();
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isEditStudent() {
        return editStudent;
    }

    public void setEditStudent(boolean editStudent) {
        this.editStudent = editStudent;
    }
    
}
