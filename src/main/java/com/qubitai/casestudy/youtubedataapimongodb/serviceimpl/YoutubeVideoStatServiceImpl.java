package com.qubitai.casestudy.youtubedataapimongodb.serviceimpl;


import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeVideoStatistics;
import com.qubitai.casestudy.youtubedataapimongodb.repository.YoutubeVideoStatisticsRepository;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeVideoStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YoutubeVideoStatServiceImpl implements YoutubeVideoStatService {

    @Autowired
    private YoutubeVideoStatisticsRepository youtubeVideoStatisticsRepository;

    @Override
    public void save(YoutubeVideoStatistics videoStatistics) {
        youtubeVideoStatisticsRepository.save(videoStatistics);
    }

    @Override
    public void update(YoutubeVideoStatistics videoStatistics) {
        youtubeVideoStatisticsRepository.save(videoStatistics);
    }

    @Override
    public YoutubeVideoStatistics get(String id) {
        return youtubeVideoStatisticsRepository.findById(id);
    }

    @Override
    public List<YoutubeVideoStatistics> getAll() {
        return youtubeVideoStatisticsRepository.findAll();
    }
}
