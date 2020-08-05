package com.qubitai.casestudy.youtubedataapimongodb.repository;


import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeChannelInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YoutubeChannelRepository extends MongoRepository<YoutubeChannelInfo,Long> {
    public YoutubeChannelInfo findByChannelId(String channelId);
    public YoutubeChannelInfo findById(String id);
}
