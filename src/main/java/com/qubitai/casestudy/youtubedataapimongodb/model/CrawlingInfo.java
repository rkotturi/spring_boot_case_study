package com.qubitai.casestudy.youtubedataapimongodb.model;

//import lombok.Data;
//import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Column;
//import javax.persistence.Entity;

@Document(collection = "crawling_info")
public class CrawlingInfo {
    @Id
    private String id;
    private String searchKey;
    private String currentPageToken;
    private String nextPageToken;
    private long totalCount;

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getCurrentPageToken() {
        return currentPageToken;
    }

    public void setCurrentPageToken(String currentPageToken) {
        this.currentPageToken = currentPageToken;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
