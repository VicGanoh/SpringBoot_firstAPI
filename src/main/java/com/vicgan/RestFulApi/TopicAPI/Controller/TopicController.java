package com.vicgan.RestFulApi.TopicAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vicgan.RestFulApi.TopicAPI.Model.Topic;
import com.vicgan.RestFulApi.TopicAPI.Services.TopicService;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    // READ A TOPIC
    @RequestMapping("/topics/{id}")
    public List<Topic> getTopic(@PathVariable String id){
        return topicService.getTopicById(id);
    }

    // ADD A TOPIC
    @RequestMapping(method=RequestMethod.POST, value="/topics" )
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //UPDATE A TOPIC
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    //DELETE A TOPIC
    @RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
