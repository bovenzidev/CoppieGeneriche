package com.prof.esempi;

import java.sql.SQLOutput;

public class TestGenerics {
    public static void main(String[] args) {

        Coppia<Integer,String> c1= new Coppia<Integer,String>(20,"Anni");
        System.out.println("C1: "+c1.toString());


        Coppia<Double,Double> c2= new Coppia<>(12.12,19.10);
        System.out.println("C2: "+c2.toString());

        Coppia<Persona, Persona> gruppo1= new Coppia<>(new Persona("Gigi", 34), new Persona("Luca", 44));
        System.out.println(gruppo1);

        //CoppiaNumeri<Double,Double> c3= new CoppiaNumeri<Double, Double>(12.12,19.10);
        //System.out.println("C3: "+c3.toString());
        
        // Errore->
        //CoppiaNumeri<String,Double> c4= new CoppiaNumeri<String, Double>("12.12",19.10);
        //System.out.println("C4: "+c4.toString());
    }
}
