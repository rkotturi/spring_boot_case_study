package com.qubitai.casestudy.youtubedataapimongodb.model;

//import lombok.Data;
//import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Column;
//import javax.persistence.Entity;

@Document(collection = "youtube_channel")
public class YoutubeChannelInfo {
    @Id
    private String id;
    private String channelId;
    private String name;
    private long subscriptionCount;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(long subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }
}
