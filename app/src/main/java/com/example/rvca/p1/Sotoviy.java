package com.example.rvca.p1;

public class Sotoviy extends Polycarbonate {


    private final double pwidth = 2.1;


    public Sotoviy(String title, double plength, double pdepth) {
        super(title, plength, pdepth);
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
