package com.example.rvca.p1;

public class Sotoviy extends Polycarbonate {


    private final double pwidth = 2.1;


    public Sotoviy(String title, String color, double plength, double pdepth) {
        super(title, color, plength, pdepth);
    }

    public double getPlength() {
        return plength;
    }

    public double getPwidth() {
        return pwidth;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getPdepth() {
        return pdepth;
    }

    public void setPlength(float plength) {
        this.plength = plength;
    }


    public void setPdepth(float pdepth) {
        this.pdepth = pdepth;
    }
}
