package com.sw.data.entity;

import com.vividsolutions.jts.geom.Geometry;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhaoshuai
 * @date 2019/10/12 15:54
 */
@Entity
@Getter
@Setter
@Table(name="metadata1")
public class Metadata {

    @Id
    @GeneratedValue
    private String id;
    private String datasource;
    private String category;
    private String city;
    private String file_id;
    private Integer lod;
    private String bbox;


    public Metadata() {
    }
    public Metadata(String city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public Integer getLod() {
        return lod;
    }

    public void setLod(Integer lod) {
        this.lod = lod;
    }

    public String getBbox() {
        return bbox;
    }

    public void setBbox(String bbox) {
        this.bbox = bbox;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "id='" + id + '\'' +
                ", datasource='" + datasource + '\'' +
                ", category='" + category + '\'' +
                ", city='" + city + '\'' +
                ", file_id='" + file_id + '\'' +
                ", lod=" + lod +
                ", bbox=" + bbox +
                '}';
    }
}