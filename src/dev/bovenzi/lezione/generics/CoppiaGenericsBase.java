package dev.bovenzi.lezione.generics;

public class CoppiaGenericsBase<T,K>{
    private T primo;
    private K secondo;

    public CoppiaGenericsBase(T primo, K secondo) {
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
        return "CoppiaGenericsBase{" +
                "primo=" + primo +
                ", secondo=" + secondo +
                '}';
    }
}
