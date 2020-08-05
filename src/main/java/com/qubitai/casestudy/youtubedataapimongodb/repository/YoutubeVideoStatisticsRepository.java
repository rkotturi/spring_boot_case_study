package com.qubitai.casestudy.youtubedataapimongodb.repository;

import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeVideoStatistics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YoutubeVideoStatisticsRepository extends MongoRepository<YoutubeVideoStatistics,Long> {
    YoutubeVideoStatistics findById(String id);
}
