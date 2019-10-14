package com.sw.data.services;

import com.sw.data.entity.Data;

public interface DataService {

    /**
     *
     * @param fileId
     * @return
     */
    Data getDataByFileId(String fileId);
}
