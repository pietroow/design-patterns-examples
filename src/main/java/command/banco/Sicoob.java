package command.banco;

import command.Command;

import java.math.BigDecimal;

public class Sicoob implements Command {
    @Override
    public void efetuarSaque(BigDecimal bigDecimal) {
        if(bigDecimal.compareTo(new BigDecimal("50")) >= 0){
            System.out.println("Este saque pode ser efetuado");
        }
    }
}
