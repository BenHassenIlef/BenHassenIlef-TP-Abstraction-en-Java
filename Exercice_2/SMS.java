package Exercice_2;

public class SMS extends Message {
    public SMS(String contenu) {
        super(contenu);
    }

    @Override
    public void envoyer() {
        System.out.println("SMS envoyé: "+contenu);
    }
}
