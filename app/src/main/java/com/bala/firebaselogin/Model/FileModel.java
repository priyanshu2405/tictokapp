package com.bala.firebaselogin.Model;

public class FileModel {
    String vurl,title;

    public FileModel() {
    }

    public FileModel(String vurl, String title) {
        this.vurl = vurl;
        this.title = title;
    }

    public String getVurl() {
        return vurl;
    }

    public void setVurl(String vurl) {
        this.vurl = vurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
