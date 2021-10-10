package com.vicgan.RestFulApi.TopicAPI.Services;

import com.vicgan.RestFulApi.TopicAPI.Model.Topic;
import com.vicgan.RestFulApi.TopicAPI.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//                new Topic("java", "Core Java", "Java for beginners"),
//               new Topic("python", "Python", "Python description"),
//               new Topic("javascript", "JavaScript", "JavaScript for dummies")
//        )
//    );

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public List<Topic> getTopicById(String id){
//        for (Topic topic : topics){
//            if (topic.getId().equals(id))
//                return topic;
//        }
//        return null;
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findTopicById(id);
    }

    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id){
//        for (int i=0; i< topics.size();i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
//        for (Topic topic: topics) {
//            if (topic.getId().equals(id)) {
//                topics.remove(topic);
//                return topic;
//            }
//        }
//        return null;
//        topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
