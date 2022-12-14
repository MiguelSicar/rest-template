package com.example.testresttemplate;

import java.util.List;

public class Gato {
    private String id;
    private String url;
    private int width;
    private int height;

    private List<String> breeds;


    private Gato() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public List<String> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<String> breeds) {
        this.breeds = breeds;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", breeds=" + breeds +
                '}';
    }
}
