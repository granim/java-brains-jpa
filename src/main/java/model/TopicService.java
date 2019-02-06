package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService{

        @Autowired
        private TopicRepository topicRepository;

        public List<Topic> getAllTopics(){
           // return topics;
            List<Topic> topics = new ArrayList<>();
             topicRepository.findAll()
                    .forEach(topics::add);
             return topics;
        }

        public void addTopic(Topic topic) {
            topicRepository.save(topic);
        }

        public Topic getTopic(String id) {
            Topic returnTopic = topicRepository.findById(id).orElse(null);
            return returnTopic;
        }

        public void updateTopic(String id, Topic topic) {
       /*     for(int i = 0; i < topics.size(); i++) {
                Topic t = topics.get(i);
                if(t.getId().equals(id)) {
                    topics.set(i, topic);
                        return;
                }
            }*/
            topicRepository.save(topic);
        }

        public void deleteTopic(String id) {
           // topics.removeIf(t -> t.getId().equals(id));
            topicRepository.deleteById(id);
    }
}

