package com.qubitai.casestudy.youtubedataapimongodb.repository;


import com.qubitai.casestudy.youtubedataapimongodb.model.CrawlingInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingInfoRepository extends MongoRepository<CrawlingInfo,Long> {
    CrawlingInfo findBySearchKey(String searchKey);
    CrawlingInfo findById(String id);
}
