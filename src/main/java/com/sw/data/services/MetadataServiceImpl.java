package com.sw.data.services;

import com.sw.data.JpaRepository.MetadataRepository;
import com.sw.data.entity.Metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoshuai
 * @date 2019/10/12 16:27
 */
@Service
public class MetadataServiceImpl implements MetadataService {

    @Autowired
    MetadataRepository metadataRepository;

    @Override
    public List<Metadata> getMetadataByBbox(String bboxWkt) {
        if (bboxWkt != null){
            return metadataRepository.findMetadataByBbox(bboxWkt);
        }
        return null;
    }
}
