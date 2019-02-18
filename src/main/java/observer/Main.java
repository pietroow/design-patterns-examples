package observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O ladrão vai roubar a bolsa? (true/false)");
        Boolean resposta = scanner.nextBoolean();

        Vitima vitima = new Vitima();
        Ladrao ladrao = new Ladrao(vitima);
        Policia policia = new Policia(ladrao);

        vitima.setDandoSopa(resposta);
        vitima.notifyObservers(vitima);

    }
}
