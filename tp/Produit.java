package tp;

public class Produit {
        private String nom;
        private  float prix;

        public Produit(String nom, float prix) {
            this.nom = nom;
            this.prix = prix;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public float getPrix() {
            return prix;
        }

        public void setPrix(float prix) {
            this.prix = prix;
        }

        public void  afficherDetails(){
            System.out.println("le nom de produit"+nom);
            System.out.println("Prix de produit"+prix);
        }


}
