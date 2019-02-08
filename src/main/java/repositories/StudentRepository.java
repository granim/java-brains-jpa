package repositories;

import model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface StudentRepository extends CrudRepository<Student, String> {

    List<Student> findAllById(String id);
}
