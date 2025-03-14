package tp;

public class ProduitSoldes extends Produit {
    private double pourcentageReduction;

    public ProduitSoldes(String nom, float prix, double pourcentageReduction) {
        super(nom, prix);
        this.pourcentageReduction = pourcentageReduction;
    }

    public double getPourcentageReduction() {
        return pourcentageReduction;
    }

    public void setPourcentageReduction(double pourcentageReduction) {
        this.pourcentageReduction = pourcentageReduction;
    }
    @Override
    public void afficherDetails(){
        System.out.println("nom du produit "+getNom());
        System.out.println("prix "+getPrix());
        double prixre=getPrix()*(1-pourcentageReduction/100);
        System.out.println("nouveauprix: "+prixre);
    }
}

