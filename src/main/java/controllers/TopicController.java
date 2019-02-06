package controllers;

import model.Course;
import model.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private CourseService topicService;

    @RequestMapping("/topics")
    public List<Course> getAllTopics(){
        return topicService.getAllTopics();
    }

    //{} variable portion pass in a token
    @RequestMapping("/topics/{id}")
    public Course getTopic(@PathVariable() String id) {
        return topicService.getTopic(id);
    }

    //Specify method value .POST the default is .GET
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Course course) {
        topicService.addTopic(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Course course, @PathVariable() String id) {
        topicService.updateTopic(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
             topicService.deleteTopic(id);
    }

}
