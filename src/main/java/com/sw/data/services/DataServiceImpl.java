package com.sw.data.services;


import com.sw.data.JpaRepository.DataRepository;
import com.sw.data.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    DataRepository dataRepository;

    @Override
    public Data getDataByFileId(String fileId) {
        if (fileId != null){
            return dataRepository.getDataByFile_id(fileId);
        }
        return null;
    }
}
