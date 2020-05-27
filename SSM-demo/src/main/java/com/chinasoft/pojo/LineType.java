package com.chinasoft.pojo;

public class LineType {
    private Integer linetypeid;

    private String linetypename;

    public Integer getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(Integer linetypeid) {
        this.linetypeid = linetypeid;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename == null ? null : linetypename.trim();
    }
}