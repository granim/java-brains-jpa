package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.TopicRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

 /*   public List<Topic> getAllTopics(String id){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }*/

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }

    public List<Topic> getAllTopics() {
        return (List<Topic>) topicRepository.findAll();
    }

}

