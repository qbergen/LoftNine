package com.example.queenabergen.loft9;

/**
 * Created by queenabergen on 10/22/16.
 */

public class ListItem {
    private String title;
    private String subtitle;
    private int imageResId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public void setSubtitle(String subtitle) {this.subtitle = subtitle; }

    public String getSubtitle(){ return subtitle;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
