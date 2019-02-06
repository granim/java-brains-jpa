package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CourseRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseService {

        @Autowired
        private CourseRepository topicRepository;

        public List<Course> getAllTopics(){
           // return courses;
            List<Course> courses = new ArrayList<>();
             topicRepository.findAll()
                    .forEach(courses::add);
             return courses;
        }

        public void addTopic(Course course) {
            topicRepository.save(course);
        }

        public Course getTopic(String id) {
            Course returnCourse = topicRepository.findById(id).orElse(null);
            return returnCourse;
        }

        public void updateTopic(String id, Course course) {
       /*     for(int i = 0; i < topics.size(); i++) {
                Course t = topics.get(i);
                if(t.getId().equals(id)) {
                    topics.set(i, course);
                        return;
                }
            }*/
            topicRepository.save(course);
        }

        public void deleteTopic(String id) {
           // topics.removeIf(t -> t.getId().equals(id));
            topicRepository.deleteById(id);
    }
}

