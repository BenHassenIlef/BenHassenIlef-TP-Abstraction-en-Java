package Exercice4;

public class Main {
    public static void main(String[] args) {
        Animal [] animaux=new Animal[2];
        animaux[0]=new Chien();
        animaux[1]=new Chat();
        for (Animal animal:animaux){
            animal.crier();
        }
    }
}
