package com.qubitai.casestudy.youtubedataapimongodb.serviceimpl;


import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeChannelInfo;
import com.qubitai.casestudy.youtubedataapimongodb.repository.YoutubeChannelRepository;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YoutubeChannelServiceImpl implements YoutubeChannelService {

    @Autowired
    YoutubeChannelRepository youtubeChannelRepository;


    @Override
    public void save(YoutubeChannelInfo channelInfo) {
        youtubeChannelRepository.save(channelInfo);
    }

    @Override
    public void update(YoutubeChannelInfo channelInfo) {
        youtubeChannelRepository.save(channelInfo);
    }

    @Override
    public YoutubeChannelInfo get(String id) {
        return youtubeChannelRepository.findById(id);
    }

    @Override
    public YoutubeChannelInfo getByChannelId(String channelId) {
        return youtubeChannelRepository.findByChannelId(channelId);
    }

    @Override
    public List<YoutubeChannelInfo> getAll() {
        return youtubeChannelRepository.findAll();
    }
}
