package com.leafo3.dto.entity;

public class PieChartData {
    private int count; 
    private String isoCode;

    public PieChartData() {
    }

    public PieChartData(int count, String isoCode) {
        this.count = count;
        this.isoCode = isoCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
    
    
}
