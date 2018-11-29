package com.example.rvca.p1;

public class Monolit extends Polycarbonate {

    private final double pwidth = 2.05;

    public Monolit(String title, String color, double plength, double pdepth) {
        super(title, color, plength, pdepth);
    }

    @Override
    public double getPlength() {
        return plength;
    }

    @Override
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

    @Override
    public double getPdepth() {
        return pdepth;
    }

    @Override
    public void setPlength(float plength) {
        this.plength = plength;
    }

    @Override
    public void setPdepth(float pdepth) {
        this.pdepth = pdepth;
    }


}
