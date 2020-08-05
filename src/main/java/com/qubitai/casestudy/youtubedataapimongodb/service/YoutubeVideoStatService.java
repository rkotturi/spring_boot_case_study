package com.qubitai.casestudy.youtubedataapimongodb.service;


import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeVideoStatistics;

import java.util.List;

public interface YoutubeVideoStatService {
    void save(YoutubeVideoStatistics videoStatistics);
    void update(YoutubeVideoStatistics videoInfo);
    YoutubeVideoStatistics get(String id);
    List<YoutubeVideoStatistics> getAll();
}
