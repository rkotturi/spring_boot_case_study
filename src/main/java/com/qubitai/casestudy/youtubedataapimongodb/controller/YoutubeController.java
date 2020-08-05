package com.qubitai.casestudy.youtubedataapimongodb.controller;

import com.qubitai.casestudy.youtubedataapimongodb.model.YouTubeVideoInfo;
import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeChannelInfo;
import com.qubitai.casestudy.youtubedataapimongodb.model.YoutubeVideoStatistics;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeApiService;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeChannelService;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeVideoInfoService;
import com.qubitai.casestudy.youtubedataapimongodb.service.YoutubeVideoStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("youtube")
public class YoutubeController {

    @Autowired
    YoutubeApiService youtubeApiService;

    @Autowired
    YoutubeVideoInfoService youtubeVideoInfoService;

    @Autowired
    YoutubeChannelService youtubeChannelService;

    @Autowired
    YoutubeVideoStatService youtubeVideoStatService;

    @GetMapping(value = "crawl/{keyword}/{pageToCrawl}")
    public String crawlVideo(@PathVariable String keyword, @PathVariable long pageToCrawl) {
        return youtubeApiService.crawlYoutubeVideoInfo(keyword,pageToCrawl);
    }

    @GetMapping
    public List<YouTubeVideoInfo> getAll(){
        return youtubeVideoInfoService.getAll();
    }

    @GetMapping(value = "{id}")
    public YouTubeVideoInfo getOne(@PathVariable String id){
        return youtubeVideoInfoService.get(id);
    }

    @GetMapping(value = "channel")
    public List<YoutubeChannelInfo> getAllChannel(){
        return youtubeChannelService.getAll();
    }

    @GetMapping(value = "channel/{id}")
    public YoutubeChannelInfo getChannel(@PathVariable String id){
        return youtubeChannelService.get(id);
    }

    @GetMapping(value = "stat")
    public List<YoutubeVideoStatistics> getAllstat(){
        return youtubeVideoStatService.getAll();
    }

    @GetMapping(value = "stat/{id}")
    public YoutubeVideoStatistics getStats(@PathVariable String id){
        return youtubeVideoStatService.get(id);
    }

}
