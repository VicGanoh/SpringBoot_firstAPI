package com.vicgan.RestFulApi.TopicAPI.Repository;

import com.vicgan.RestFulApi.TopicAPI.Model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {

    public List<Topic> findTopicById(String id);
}
