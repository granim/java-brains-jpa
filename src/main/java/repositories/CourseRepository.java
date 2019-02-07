package repositories;

import model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Extend the JPA CrudRepository and provide the generic types The entity class and the id of the class
public interface CourseRepository extends CrudRepository<Course, String> {

     List<Course> findByTopicId(String topicId);

}
