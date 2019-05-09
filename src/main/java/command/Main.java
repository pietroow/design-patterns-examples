package command;

import command.banco.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar: ");
        BigDecimal bigDecimal = scan.nextBigDecimal();

        System.out.println("Escolha qual banco deseja sacar ");
        System.out.println("[1] ITAU");
        System.out.println("[2] BRADESCO");
        System.out.println("[3] SICOOB");
        System.out.println("[4] BANCO DO BRASIL");
        System.out.println("[5] SANTANDER");
        int opcao = scan.nextInt();

        Command banco = null;

        switch (opcao) {
            case 1:
                banco = new Itau();
                break;
            case 2:
                banco = new Bradesco();
                break;
            case 3:
                banco = new Sicoob();
                break;
            case 4:
                banco = new BancoDoBrasil();
                break;
            case 5:
                banco = new Santander();
                break;
            default:
                throw new RuntimeException("Opcao invalida");
        }

        banco.efetuarSaque(bigDecimal);
    }
}
