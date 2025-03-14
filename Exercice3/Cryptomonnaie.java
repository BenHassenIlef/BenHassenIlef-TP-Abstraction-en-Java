package Exercice3;

public class Cryptomonnaie extends Paiement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de "+montant+"€ effectué en cryptomonnaie.");
    }
}
