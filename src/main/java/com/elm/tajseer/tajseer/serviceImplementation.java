package com.elm.tajseer.tajseer;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class serviceImplementation implements Service {


    @Autowired
    private repository repository;

    @Override
    public void addStudent(Student student) {
        Student yaz = new Student();
        yaz.setStudentId(20);
        yaz.setStudentName("yazeed");
        yaz.setStudentLastName("alhamdi");
        yaz.setCourse("java");
        repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student selectPersonById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Student updatePerson(Student student, int id) {

        student.setStudentId(id);

        return repository.save(student);
    }

    @Override
    public void deleteStudent(int Id) {

        repository.deleteById(Id);

    }


}






