package dev.bovenzi.lezione.generics;

public class TestGenerics {
    public static void main(String[] args) {

        CoppiaGenericsBase<Integer,String> c1= new CoppiaGenericsBase<Integer,String>(20,"Anni");
        System.out.println("C1: "+c1.toString());


        CoppiaGenericsBase<Double,Double> c2= new CoppiaGenericsBase<>(12.12,19.10);
        System.out.println("C2: "+c2.toString());

        CoppiaGenericsBase<Persona, Persona> gruppo1= new CoppiaGenericsBase<>(new Persona("Gigi", 34), new Persona("Luca", 44));
        System.out.println(gruppo1);

        //CoppiaGenerics<Double,Double> c3= new CoppiaGenerics<Double, Double>(12.12,19.10);
        //System.out.println("C3: "+c3.toString());
        
        // Errore->
        //CoppiaGenerics<String,Double> c4= new CoppiaGenerics<String, Double>("12.12",19.10);
        //System.out.println("C4: "+c4.toString());
    }
}
