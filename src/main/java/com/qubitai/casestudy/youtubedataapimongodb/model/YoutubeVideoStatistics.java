package com.qubitai.casestudy.youtubedataapimongodb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Column;
//import javax.persistence.Entity;

@Document(collection = "youtube_video_stat")
public class YoutubeVideoStatistics {
    @Id
    private String id;
    private long likeCount;
    private long dislikeCount;
    private long viewCount;
    private long favouriteCount;
    private long commentCount;
    private String videoId;

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public long getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(long dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public long getViewCount() {
        return viewCount;
    }

    public void setViewCount(long viewCount) {
        this.viewCount = viewCount;
    }

    public long getFavouriteCount() {
        return favouriteCount;
    }

    public void setFavouriteCount(long favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
