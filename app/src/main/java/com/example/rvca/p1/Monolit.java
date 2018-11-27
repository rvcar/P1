package com.example.rvca.p1;

public class Monolit extends Polycarbonate {

    private final double pwidth = 2.05;

    public Monolit(double plength, double pdepth) {
        super(plength, pdepth);
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
