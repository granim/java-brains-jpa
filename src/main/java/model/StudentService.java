package model;

import org.springframework.stereotype.Service;
import repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public Student getStudent(String id){
        return studentRepository.findById(id).orElse(null);
    }

    public void addStudent(Student student) {
         studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getAllStudents(String id) {
        List<Student> students = new ArrayList<>();
            studentRepository.findAllById(id)
                    .forEach(students::add);
            return students;
    }
}
