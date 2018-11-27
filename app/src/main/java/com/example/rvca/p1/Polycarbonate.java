package com.example.rvca.p1;

public abstract class Polycarbonate {

    protected double plength;
    protected double pwidth;
    protected double pdepth;

    public Polycarbonate(double plength, double pdepth) {
        this.plength = plength;

        this.pdepth = pdepth;
    }

    public abstract double getPlength();

    public abstract double getPwidth();


    public abstract double getPdepth();

    public abstract void setPlength(float plength);


    public abstract void setPdepth(float pdepth);


}
