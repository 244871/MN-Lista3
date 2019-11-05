package com.company;

public class WynikiSkoczek {

    int iteracja;
    double xl;
    double wynikl;
    double xu;
    double wyniku;
    double dokladnosc;
    double xr;
    double wynikr;

    public WynikiSkoczek(int iteracja, double xl, double wynikl, double xu, double wyniku, double dokladnosc, double xr, double wynikr) {
        this.iteracja = iteracja;
        this.xl = xl;
        this.wynikl = wynikl;
        this.xu = xu;
        this.wyniku = wyniku;
        this.dokladnosc = dokladnosc;
        this.xr = xr;
        this.wynikr = wynikr;
    }

    @Override
    public String toString() {
        return  '\n'+
                "iteracja=" + iteracja +
                ", xl=" + xl +
                ", wynikl=" + wynikl +
                ", xu=" + xu +
                ", wyniku=" + wyniku +
                ", dokladnosc=" + dokladnosc +
                ", xr=" + xr +
                ", wynikr=" + wynikr
                ;
    }
}

