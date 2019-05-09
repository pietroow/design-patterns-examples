package command.banco;

import command.Command;

import java.math.BigDecimal;

public class Itau implements Command {

    @Override
    public void efetuarSaque(BigDecimal bigDecimal) {
        if(bigDecimal.compareTo(new BigDecimal("120")) <= 0){
            System.out.println("Saque pode ser efetuado");
            System.out.println(bigDecimal + " sacado.");
        }
    }

}
