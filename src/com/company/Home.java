package com.company;


public final class Home extends Siti {

    private String adres;
    private Prizident prizident;

    public Home(String imy, int lydi, int plochat,
                String adres, Prizident prizident) {
        super(imy, lydi, plochat);
        this.adres = adres;
        this.prizident = prizident;

    }

    public String getAdres() {
        return adres;
    }

    @Override
    public void mitihg(String crik) {
        System.out.println("дома кричали так " + crik);
    }

    @Override
    public void raspechatka() {
        System.out.println("_____________________");
        System.out.println("adres "+ adres);
        System.out.println("prizident "+ prizident.getImy());
    }
}
