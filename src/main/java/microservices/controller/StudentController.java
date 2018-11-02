package microservices.controller;

import org.springframework.web.bind.annotation.RestController;

import microservices.documents.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import microservices.repositories.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/saveStudent")
    public void saveStudent(@RequestBody Student user) {
        studentRepository.save(user);
    }

    @GetMapping("/retrieveAllStudents")
    public List<Student> retrieveAllStudents() {
        return studentRepository.findAll();
    }
}
