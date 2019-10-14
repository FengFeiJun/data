package com.sw.data.services;

import com.sw.data.entity.Metadata;

import java.util.List;

/**
 * @author zhaoshuai
 * @date 2019/10/12 15:58
 */
public interface MetadataService {

    /**
     *
     * @param bboxWkt
     * @return
     */
    List<Metadata> getMetadataByBbox(String bboxWkt);

}

