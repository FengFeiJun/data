package com.sw.data.entity;

import java.util.List;

public class MetadataRefactor {

    private String url_prefix;

    private List<Metadata> tiles;

    public String getUrl_prefix() {
        return url_prefix;
    }

    public void setUrl_prefix(String url_prefix) {
        this.url_prefix = url_prefix;
    }

    public List<Metadata> getTiles() {
        return tiles;
    }

    public void setTiles(List<Metadata> tiles) {
        this.tiles = tiles;
    }
}
