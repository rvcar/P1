package com.example.rvca.p1;

public class Sotoviy extends Polycarbonate {

    private float plength;
    private float pwidth;
    private float pdepth;

    public Sotoviy(float plength, float pwidth, float pdepth) {
        this.plength = plength;
        this.pwidth = pwidth;
        this.pdepth = pdepth;


    }

    public float getPlength() {
        return plength;
    }

    public float getPwidth() {
        return pwidth;
    }

    public float getPdepth() {
        return pdepth;
    }

    public void setPlength(float plength) {
        this.plength = plength;
    }

    public void setPwidth(float pwidth) {
        this.pwidth = pwidth;
    }

    public void setPdepth(float pdepth) {
        this.pdepth = pdepth;
    }
}
