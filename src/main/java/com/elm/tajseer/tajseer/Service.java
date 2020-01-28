package com.elm.tajseer.tajseer;

import java.util.List;
import java.util.Optional;

public interface Service {
    public void addStudent(Student student);
    public List<Student> getAllStudents();
    public Student selectPersonById(int id);
    public Student updatePerson(Student student ,int id);
    public void deleteStudent(int id);
}


