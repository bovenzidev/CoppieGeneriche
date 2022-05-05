package com.prof.esempi;

public class CoppiaNumeri <T1 extends Number, T2 extends Number>{
    private T1 primo;
    private T2 secondo;

    public CoppiaNumeri(T1 primo, T2 secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public T1 getPrimo() {
        return primo;
    }

    public void setPrimo(T1 primo) {
        this.primo = primo;
    }

    public T2 getSecondo() {
        return secondo;
    }

    public void setSecondo(T2 secondo) {
        this.secondo = secondo;
    }

    @Override
    public String toString() {
        return "CoppiaNumeri{" +
                "primo=" + primo +
                ", secondo=" + secondo +
                '}';
    }
}
