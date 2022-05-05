package com.prof.esempi;

public class Coppia <T,K>{
    private T primo;
    private K secondo;

    public Coppia(T primo, K secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public T getPrimo() {
        return primo;
    }

    public void setPrimo(T primo) {
        this.primo = primo;
    }

    public K getSecondo() {
        return secondo;
    }

    public void setSecondo(K secondo) {
        this.secondo = secondo;
    }

    @Override
    public String toString() {
        return "Coppia{" +
                "primo=" + primo +
                ", secondo=" + secondo +
                '}';
    }
}
