package com.qubitai.casestudy.youtubedataapimongodb.service;


import com.qubitai.casestudy.youtubedataapimongodb.model.YouTubeVideoInfo;

import java.util.List;

public interface YoutubeVideoInfoService {
    void save(YouTubeVideoInfo videoInfo);
    void update(YouTubeVideoInfo videoInfo);
    YouTubeVideoInfo getByVideoId(String videoId);
    YouTubeVideoInfo get(String id);
    List<YouTubeVideoInfo> getAll();
}
