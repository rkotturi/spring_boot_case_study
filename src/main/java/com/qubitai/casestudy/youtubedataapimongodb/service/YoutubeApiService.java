package com.qubitai.casestudy.youtubedataapimongodb.service;

public interface YoutubeApiService {
    String crawlYoutubeVideoInfo(String keyword, long pageToCrawl);
}
