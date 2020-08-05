package com.qubitai.casestudy.youtubedataapimongodb.repository;

import com.qubitai.casestudy.youtubedataapimongodb.model.YouTubeVideoInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YoutubeVideoInfoRepository extends MongoRepository<YouTubeVideoInfo,Long> {
    YouTubeVideoInfo findByVideoId(String videoId);
    YouTubeVideoInfo findById(String id);
}
