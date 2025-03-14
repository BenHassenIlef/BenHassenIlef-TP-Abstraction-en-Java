package Exercice_2;
public class Main {
    public static void main(String[] args) {
        Message email =new Email("c'est un email");
        email.envoyer();
        Message sms =new SMS("c'est un SMS");
        sms.envoyer();
    }
}
