package controllers;

import model.Course;
import model.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import model.Topic;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    //{} variable portion pass in a token
    @RequestMapping(method = RequestMethod.GET, value ="/topics/{id}/courses/{id}")
    public Course getCourse(@PathVariable() String id) {
        return courseService.getCourse(id);
    }

    //Specify method value .POST the default is .GET
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable() String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
             courseService.deleteCourse(id);
    }

}
