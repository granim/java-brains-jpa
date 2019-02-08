package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CourseRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseService {

        @Autowired
        private CourseRepository courseRepository;

        public List<Course> getAllCourses(String topicId){
            List<Course> courses = new ArrayList<>();
             courseRepository.findByTopicId(topicId)
                    .forEach(courses::add);
             return courses;
        }

   /*     public List<Course> getAllCourseByDescirption(String name) {
            List<Course> courses = new ArrayList<>();
            courseRepository.findByCourseDescription(name)
                    .forEach(courses::add);
            return courses;
        }*/



        public Course getCourse(String id) {
            return courseRepository.findById(id).orElse(null);
           // return returnCourse;
        }

        public void addCourse(Course course) {
        courseRepository.save(course);
        }

        public void updateCourse(Course course) {
            courseRepository.save(course);
        }

        public void deleteCourse(String id) {
           // topics.removeIf(t -> t.getId().equals(id));
            courseRepository.deleteById(id);
    }
}

