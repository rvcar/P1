package com.example.rvca.p1;

public abstract class Polycarbonate {

    protected String title;
    protected double plength;
    protected double pwidth;
    protected double pdepth;

    public Polycarbonate(String title, double plength, double pdepth) {

        this.title = title;
        this.plength = plength;
        this.pdepth = pdepth;

    }

    public abstract double getPlength();

    public abstract double getPwidth();

    public abstract String getTitle();

    public abstract void setTitle(String title);


    public abstract double getPdepth();

    public abstract void setPlength(float plength);

    public abstract void setPdepth(float pdepth);


}
