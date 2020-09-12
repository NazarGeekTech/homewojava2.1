package com.company;

public class Siti extends Strana {
    private int plochat;

    public Siti(String imy, int lydi, int plochat) {
        super(imy, lydi);
        this.plochat = plochat;
    }

    public int getPlochat() {
        return plochat;
    }

    public final void mitihg(String crik, int colichestva) {
        System.out.println("Кричали: " + crik);
        System.out.println("Столько раз кричали: " + colichestva);
    }

    public void mitihg(String crik) {
        System.out.println("Кричали: " + crik);

    }

    public void raspechatka() {
        System.out.println("Plochat " + plochat);
    }


}