package com.qubitai.casestudy.youtubedataapimongodb.service;



import com.qubitai.casestudy.youtubedataapimongodb.model.CrawlingInfo;

import java.util.List;

public interface CrawlingInfoService {
    void save(CrawlingInfo crawlingInfo);
    void update(CrawlingInfo crawlingInfo);
    CrawlingInfo get(String id);
    CrawlingInfo getBySearchKey(String searchKey);
    List<CrawlingInfo> getAll();
}
