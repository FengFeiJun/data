package com.sw.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "sw_data")
public class Data {
    @Id
    @GeneratedValue
    private String file_id;
    private String gltf;

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public void setGltf(String gltf) {
        this.gltf = gltf;
    }

    public String getFile_id() {
        return file_id;
    }

    public String getGltf() {
        return gltf;
    }
}
