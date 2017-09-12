package com.leafo3.dto.request;

public class DamageClassChart {
    private int count;
    private String isoCode; 
    private double avg;

    public DamageClassChart() {
    }

    public DamageClassChart(int count, String isoCode, double avg) {
        this.count = count;
        this.isoCode = isoCode;
        this.avg = avg;
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

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    
}
