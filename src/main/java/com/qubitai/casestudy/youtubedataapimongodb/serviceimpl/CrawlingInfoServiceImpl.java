package com.qubitai.casestudy.youtubedataapimongodb.serviceimpl;

import com.qubitai.casestudy.youtubedataapimongodb.model.CrawlingInfo;
import com.qubitai.casestudy.youtubedataapimongodb.repository.CrawlingInfoRepository;
import com.qubitai.casestudy.youtubedataapimongodb.service.CrawlingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrawlingInfoServiceImpl implements CrawlingInfoService {

    @Autowired
    private CrawlingInfoRepository crawlingInfoRepository;

    @Override
    public void save(CrawlingInfo crawlingInfo) {
        crawlingInfoRepository.save(crawlingInfo);
    }

    @Override
    public void update(CrawlingInfo crawlingInfo) {
        crawlingInfoRepository.save(crawlingInfo);
    }

    @Override
    public CrawlingInfo get(String id) {
        return crawlingInfoRepository.findById(id);
    }

    @Override
    public CrawlingInfo getBySearchKey(String searchKey) {
        return crawlingInfoRepository.findBySearchKey(searchKey);
    }

    @Override
    public List<CrawlingInfo> getAll() {
        return crawlingInfoRepository.findAll();
    }
}
