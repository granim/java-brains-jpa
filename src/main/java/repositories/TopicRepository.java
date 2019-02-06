package repositories;

import model.Topic;
import org.springframework.data.repository.CrudRepository;

//Extend the JPA CrudRepository and provide the generic types The entity class and the id of the class
public interface TopicRepository extends CrudRepository<Topic, String> {


}
