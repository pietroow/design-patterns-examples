package command.banco;

import command.Command;

import java.math.BigDecimal;

public class Santander implements Command {
    @Override
    public void efetuarSaque(BigDecimal bigDecimal) {
        if(bigDecimal.compareTo(new BigDecimal("150")) >= 0){
            System.out.println("Este saque pode ser efetuado");
            System.out.println("Sacado "+bigDecimal+" reais");
        }
    }
}
