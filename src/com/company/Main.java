package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykładowaKlasa klasa = new PrzykładowaKlasa();
        klasa.PrzykladowaMetoda();
        klasa.InnaMetoda();
    }
}

interface PrzykladowyInterfejs {
    public void PrzykladowaMetoda();
}

interface InnyInterfejs {
    public void InnaMetoda();
}

class PrzykładowaKlasa implements PrzykladowyInterfejs, InnyInterfejs {

    @Override
    public void PrzykladowaMetoda() {
        System.out.println("Implementacja przykladowej Metody");
    }

    @Override
    public void InnaMetoda() {
        System.out.println("Implementacja innej Metody");
    }
}