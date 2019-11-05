package com.company;

import java.util.ArrayList;

public class Skoczek {

    public Skoczek(double xl, double xu) {
        getWyniki(xl, xu);
    }


    public void getWyniki(double xl, double xu) {

        ArrayList<WynikiSkoczek> wyniki = new ArrayList<WynikiSkoczek>();

        for (int i = 0; i < 3; i++) {

            if (oblicz(obliczxr(xl, xu)) * oblicz(xl) > 0) {
                xl = obliczxr(xl, xu);
            } else {
                xu = obliczxr(xl, xu);
            }
            wyniki.add(new WynikiSkoczek(i, xl, oblicz(xl), xu, oblicz(xu), dokladnosc(xl, xu), obliczxr(xl, xu), oblicz(obliczxr(xl, xu))));
        }

        System.out.println("Zad 1");
        System.out.print(wyniki.toString());
        System.out.println();
    }

    public static double oblicz(double x){
        return ((68.1*9.81)/x)*(1-Math.exp((-x/68.1)*10))-40;
    }
    private static double dokladnosc(double xl, double xu){
        return (Math.abs((xl - xu) / xl)) * 100;
    }
    private static double obliczxr(double xl, double xu){
        return  (xu + xl) / 2;
    }

}
