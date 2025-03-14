package Exercice3;

public class Main {
    public static void main(String[] args) {
            Paiement cartebaancaire =new Cryptomonnaie();
            cartebaancaire.effectuerPaiement(500.200);
            Paiement crypto=new Cryptomonnaie();
            crypto.effectuerPaiement(55.78);
    }
}
