package com.company;

import java.util.ArrayList;

public class Trójmian {

    Trójmian(double xl, double xu, double dok) {
        getWynikiTrojmianu(xl, xu, dok);
    }

    private void getWynikiTrojmianu(double xl, double xu, double dok) {

        ArrayList<Wyniki> wyniki= new ArrayList<Wyniki>();
        for (int i = 0; i <100; i++) {

            if (oblicz(obliczxr(xl, xu)) * oblicz(xl) > 0) {
                xl = obliczxr(xl, xu);
            } else {
                xu = obliczxr(xl, xu);
            }

            if(dokladnosc(xl, xu)<=dok){
                break;
            }
            wyniki.add(new Wyniki(i, xl, oblicz(xl), xu, bladT(oblicz(xl)), bladT(oblicz(xu)),oblicz(xu), dokladnosc(xl, xu), obliczxr(xl, xu), oblicz(obliczxr(xl, xu))));

        }
        System.out.println("Zad 2");
        System.out.print(wyniki.toString());
        System.out.println();
    }


    private static double oblicz(double x){
        return ((-0.5)*Math.pow(x,2)+(2.5*x)+4.5);
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

