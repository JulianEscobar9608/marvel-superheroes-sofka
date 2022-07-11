package com.model;

public class Thumbnail {

    private String path;
    private String extension;

    @Override
    public String toString() {
        return path+'.'+extension;
    }
}
