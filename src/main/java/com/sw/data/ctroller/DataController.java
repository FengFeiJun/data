package com.sw.data.ctroller;

import com.alibaba.fastjson.JSONArray;
import com.sw.data.entity.Data;
import com.sw.data.entity.Metadata;
import com.sw.data.entity.MetadataRefactor;
import com.sw.data.services.DataService;
import com.sw.data.services.MetadataService;
import com.vividsolutions.jts.io.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author zhaoshuai
 * @date 2019/10/12 15:58
 */
@RestController
public class DataController {

    @Autowired
    MetadataService metadataService;
    @Autowired
    DataService dataService;

    /**
     *
     * @param bbox
     * @return
     */
    @RequestMapping(value = "/SW_data/metadata/{bbox}", method = RequestMethod.GET)
    public String getMetadata(@PathVariable("bbox") String bbox) throws ParseException {

        String[] split = bbox.split(",");

        String lt_lon = split[0];
        String lt_lat = split[1];
        String rb_lon = split[2];
        String rb_lat = split[3];

        String bboxWkt;
        bboxWkt = String.format("POLYGON((%s %s, %s %s, %s %s, %s %s, %s %s))",
                lt_lon, lt_lat, rb_lon, lt_lat, rb_lon, rb_lat, lt_lon, rb_lat, lt_lon, lt_lat);


        List<Metadata> dataList;
        dataList = metadataService.getMetadataByBbox(bboxWkt);

        MetadataRefactor metadataRefactor = new MetadataRefactor();
        metadataRefactor.setUrl_prefix("http://ip:port/SW_data/{category}/");
        metadataRefactor.setTiles(dataList);

        String jsonString = JSONArray.toJSONString(metadataRefactor);

        return jsonString;
    }

    @RequestMapping("/SW_data/{category}/{fileid}")
    public String getData(@PathVariable("fileid") String fileId){
        Data resData = dataService.getDataByFileId(fileId);
        return resData.getGltf();
    }

}
