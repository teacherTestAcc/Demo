package com.chinasoft.pojo;

public class Image {
    private Integer imageid;

    private String mainpic;

    private String picone;

    private String pictwo;

    private String picthree;

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getMainpic() {
        return mainpic;
    }

    public void setMainpic(String mainpic) {
        this.mainpic = mainpic == null ? null : mainpic.trim();
    }

    public String getPicone() {
        return picone;
    }

    public void setPicone(String picone) {
        this.picone = picone == null ? null : picone.trim();
    }

    public String getPictwo() {
        return pictwo;
    }

    public void setPictwo(String pictwo) {
        this.pictwo = pictwo == null ? null : pictwo.trim();
    }

    public String getPicthree() {
        return picthree;
    }

    public void setPicthree(String picthree) {
        this.picthree = picthree == null ? null : picthree.trim();
    }
}