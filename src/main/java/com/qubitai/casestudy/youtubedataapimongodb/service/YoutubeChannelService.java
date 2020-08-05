package com.qubitai.casestudy.youtubedataapimongodb.service;


import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeChannelInfo;

import java.util.List;

public interface YoutubeChannelService {

    void save(YoutubeChannelInfo channelInfo);
    void update(YoutubeChannelInfo channelInfo);
    YoutubeChannelInfo get(String id);
    YoutubeChannelInfo getByChannelId(String channelId);
    List<YoutubeChannelInfo> getAll();

}
