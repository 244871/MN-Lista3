package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Wielomian {

    Wielomian(double xl, double xu, double dok) {
        getWynikiWielomianu(xl, xu, dok);
    }

    private void getWynikiWielomianu(double xl, double xu, double dok) {

        ArrayList<Wyniki> wynikis= new ArrayList<Wyniki>();
        for (int i = 0; i <100; i++) {

            if (oblicz(obliczxr(xl, xu)) * oblicz(xl) > 0) {
                xl = obliczxr(xl, xu);
            } else {
                xu = obliczxr(xl, xu);
            }

            if(dokladnosc(xl, xu)<=dok){
                break;
            }
            wynikis.add(new Wyniki(i, xl, oblicz(xl), xu, bladT(oblicz(xl)), bladT(oblicz(xu)),oblicz(xu), dokladnosc(xl, xu), obliczxr(xl, xu), oblicz(obliczxr(xl, xu))));

        }
        System.out.println("Zad 3");
        System.out.print(wynikis.toString());
        System.out.println();
    }



    private static double oblicz(double x){
        return (Math.pow(x,3))+(Math.pow(x,2))-3*x-3;
    }
    private static double bladT(double wynik){
        return ((Math.sqrt(3)-wynik)*100)/Math.sqrt(3);
    }
    private static double dokladnosc(double xl, double xu){
        return (Math.abs((xl - xu) / xl)) * 100;
    }
    private static double obliczxr(double xl, double xu){
        return  (xu + xl) / 2;
    }
}
