package tp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choisissez le type de produit:");
        System.out.println("1. Produit standard");
        System.out.println("2. Produit en solde");
        System.out.println("3. Produit en promotion");
        System.out.println("entrer le nom du produit");
        String nom= sc.nextLine();
        System.out.println("entrer le prix de produit");
        float prix = sc.nextFloat();
        int choix= sc.nextInt();
        Produit pr;
        switch (choix){
            case 1:
                pr=new Produit(nom,prix);
                pr.afficherDetails();
                break;
            case 2:
                System.out.println("donner le prix de reduction");
                double reduction=sc.nextDouble();
                pr=new ProduitSoldes(nom,prix,reduction);
                pr.afficherDetails();
                break;
            case 3:
                System.out.println("donner le prix de promotion");
                double prixPromo=sc.nextDouble();
                pr=new ProduitPromotion(nom,prix,prixPromo);
                pr.afficherDetails();
                break;
            default:
                System.out.println("choix invalide");
        }

    }

}
