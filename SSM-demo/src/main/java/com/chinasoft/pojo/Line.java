package com.chinasoft.pojo;

public class Line {
    private Integer lineid;

    private String linename;

    private Double teamprice;

    private Double maxyh;

    private Integer days;

    private Integer imageid;

    private String introduce;

    private String vehicle;

    private Integer linetypeid;

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public Double getTeamprice() {
        return teamprice;
    }

    public void setTeamprice(Double teamprice) {
        this.teamprice = teamprice;
    }

    public Double getMaxyh() {
        return maxyh;
    }

    public void setMaxyh(Double maxyh) {
        this.maxyh = maxyh;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public Integer getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(Integer linetypeid) {
        this.linetypeid = linetypeid;
    }
}