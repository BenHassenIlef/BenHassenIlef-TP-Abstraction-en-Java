package Exercice_3;

public class Main {
    public static void main(String[] args) {
        Paiement cartebancaire =new Cryptomonnaie();
        cartebancaire.effectuerPaiement(500.200);
        Paiement crypto=new Cryptomonnaie();
        crypto.effectuerPaiement(55.78);
    }
}