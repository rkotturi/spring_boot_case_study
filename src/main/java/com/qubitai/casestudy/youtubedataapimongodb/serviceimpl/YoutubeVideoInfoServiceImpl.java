package com.qubitai.casestudy.youtubedataapimongodb.serviceimpl;

import com.qubitai.casestudy.youtubedataapimongodb.model.YouTubeVideoInfo;
import com.qubitai.casestudy.youtubedataapimongodb.repository.YoutubeVideoInfoRepository;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeVideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YoutubeVideoInfoServiceImpl implements YoutubeVideoInfoService {

    @Autowired
    private YoutubeVideoInfoRepository youtubeVideoInfoRepository;

    @Override
    public void save(YouTubeVideoInfo videoInfo) {
        youtubeVideoInfoRepository.save(videoInfo);
    }

    @Override
    public void update(YouTubeVideoInfo videoInfo) {
        youtubeVideoInfoRepository.save(videoInfo);
    }

    @Override
    public YouTubeVideoInfo getByVideoId(String videoId) {
        return youtubeVideoInfoRepository.findByVideoId(videoId);
    }

    @Override
    public YouTubeVideoInfo get(String id) {
        return youtubeVideoInfoRepository.findById(id);
    }

    @Override
    public List<YouTubeVideoInfo> getAll() {
        return youtubeVideoInfoRepository.findAll();
    }
}
