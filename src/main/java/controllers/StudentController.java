package controllers;

import model.Student;
import model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("students/{id}")
    public List<Student> getStudent(@PathVariable String id){
        return studentService.getAllStudents(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

}
