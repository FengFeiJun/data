package com.sw.data.JpaRepository;

import com.sw.data.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataRepository extends JpaRepository<Data, Long> {

    @Query(value = "SELECT file_id,gltf from sw_data where file_id = ?1", nativeQuery = true)
    Data getDataByFile_id(String fileId);

}
