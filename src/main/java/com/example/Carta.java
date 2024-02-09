package com.example;

public class Carta {
    private int numero;
    private NaipeEnum naipe;

    public Carta(int numero, NaipeEnum naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public NaipeEnum getNaipe() {
        return naipe;
    }

    public  String imagePath(){
        return "classic-cards"+getNumero()+getNaipe()+".png";
    }
}
