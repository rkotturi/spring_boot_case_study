package com.qubitai.casestudy.youtubedataapimongodb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
import java.util.Date;

@Document(collection = "youtube_video_info")
public class YouTubeVideoInfo {
    @Id
    private String id;
    private String videoId;
    private String title;
    private String thumbnailUrl;
    private String description;
    private Date publishedDate;
    private String videoDefinition;
    private String videoDuration;
    private String videoCaption;
    private String videoprojection;
    private String countryRestricted;
    private String keyword;
    private YoutubeChannelInfo channelInfo;
    private YoutubeVideoStatistics videoStatistics;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getVideoDefinition() {
        return videoDefinition;
    }

    public void setVideoDefinition(String videoDefinition) {
        this.videoDefinition = videoDefinition;
    }

    public String getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(String videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getVideoCaption() {
        return videoCaption;
    }

    public void setVideoCaption(String videoCaption) {
        this.videoCaption = videoCaption;
    }

    public String getVideoprojection() {
        return videoprojection;
    }

    public void setVideoprojection(String videoprojection) {
        this.videoprojection = videoprojection;
    }

    public String getCountryRestricted() {
        return countryRestricted;
    }

    public void setCountryRestricted(String countryRestricted) {
        this.countryRestricted = countryRestricted;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public YoutubeChannelInfo getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(YoutubeChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public YoutubeVideoStatistics getVideoStatistics() {
        return videoStatistics;
    }

    public void setVideoStatistics(YoutubeVideoStatistics videoStatistics) {
        this.videoStatistics = videoStatistics;
    }
}
