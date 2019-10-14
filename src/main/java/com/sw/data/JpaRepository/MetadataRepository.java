package com.sw.data.JpaRepository;

import com.sw.data.entity.Metadata;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author zhaoshuai
 * @date 2019/10/12 16:29
 */
public interface MetadataRepository extends JpaRepository<Metadata, Long> {

//    @Query(value = "SELECT datasource,category,st_asewkt(bbox),lod,city,file_id from metadata where ST_Intersects(bbox, ST_GeomFromText(?, 4326))")
    @Query(value = "SELECT id,datasource,category,st_asewkb(bbox) bbox,lod,city,file_id from metadata where ST_Intersects(bbox, ST_GeomFromText(?1, 4326))", nativeQuery = true)
    List<Metadata> findMetadataByBbox(String bboxWkt);

}

