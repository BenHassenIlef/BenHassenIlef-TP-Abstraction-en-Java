package Exercice_2;

abstract class Message {
    public String contenu;

    public Message(String contenu) {
        this.contenu = contenu;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public abstract void envoyer();
}