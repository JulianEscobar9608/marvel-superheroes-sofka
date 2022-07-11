package com.model;

import java.util.List;

public class Results {

    private String id;
    private String name;
    private String description;
    private String modified;
    private Thumbnail thumbnail;

    public Results(String id, String name, String description, String modified,Thumbnail thumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.thumbnail = thumbnail;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    @Override
    public String toString() {
        return "Results{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", modified='" + modified + '\'' +
                ", thumbnail=" + thumbnail +
                '}';
    }
}
