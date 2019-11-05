package com.company;

import java.util.ArrayList;

public class Saturacja {
    Saturacja(double xl, double xu,double dok, double o) {
        getWynikiSaturacji(xl, xu,dok, o);
    }

    private void getWynikiSaturacji(double xl, double xu,double dok, double o) {
    ArrayList<Wyniki> wyniki= new ArrayList<Wyniki>();
        for (int i = 0; i <100; i++) {

        if (oblicz(obliczxr(xl, xu), o) * oblicz(xl, o) > 0) {
            xl = obliczxr(xl, xu);
        } else {
            xu = obliczxr(xl, xu);
        }

        if(dokladnosc(xl, xu)<=dok){
            break;
        }
        wyniki.add(new Wyniki(i, xl, oblicz(xl, o), xu, bladT(oblicz(xl, o)), bladT(oblicz(xu, o)),oblicz(xu, o), dokladnosc(xl, xu), obliczxr(xl, xu), oblicz(obliczxr(xl, xu), o)));

    }
        System.out.println("Zad 4");
        System.out.print(wyniki.toString());
        System.out.println();
}


    private static double oblicz(double x, double o){
        return (((-139.34411-Math.log(o)))*(Math.pow((x+273.15), 4)))
                +(1.575701*Math.pow(10, 5)*Math.pow((x+273.15), 3))
                -((6.642308*Math.pow(10, 7))*Math.pow((x+273.15),2))
                +((1.243800*Math.pow(10, 10))*(x+273.15))
                -(8.621949*Math.pow(10, 11));
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
