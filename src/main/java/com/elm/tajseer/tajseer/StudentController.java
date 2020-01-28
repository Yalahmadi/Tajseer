package com.elm.tajseer.tajseer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
public class StudentController {

    @Autowired
    private Service service;


    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return ResponseEntity.ok("Added");
    }


    @GetMapping("/get")

    public ResponseEntity<?> getStudent() {


        return ResponseEntity.ok(service.getAllStudents());


    }


    @GetMapping("/{id}")
    public Student student(@PathVariable("id") int id) {

        return service.selectPersonById(id);

    }


    @PutMapping("/{id}")
    public Student updatePerson(@RequestBody Student student, @PathVariable("id") int id) {


        return service.updatePerson(student, id);


    }

    @DeleteMapping(value = "/{Id}")

    public void deleteStudent(@PathVariable("Id") int id) {


        service.deleteStudent(id);


    }

}






