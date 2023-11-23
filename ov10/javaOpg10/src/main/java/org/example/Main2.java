package org.example;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        MenyRegister menyReg = new MenyRegister();
        menyReg.registrereNyMeny(1);
        menyReg.registrereNyMeny(2);
        menyReg.registrereNyRett("Taco","Middag",120);
        menyReg.registrereNyRett("Burger","Middag",130);
        menyReg.registrereNyRett("Kake","Dessert",599);
        menyReg.fordeleRettTilMeny(2,"Taco");
        menyReg.fordeleRettTilMeny(2,"Burger");
        menyReg.fordeleRettTilMeny(1,"Kake");

        System.out.println(menyReg.toString());
        System.out.println("\n\n");
        System.out.println(menyReg.finneMenyerIntervall(81,600));
        System.out.println("\n\n");
        System.out.println(menyReg.finneTypeMedNavn("Kake"));
        System.out.println(menyReg.finneRetterVedType("Middag"));
    }
}