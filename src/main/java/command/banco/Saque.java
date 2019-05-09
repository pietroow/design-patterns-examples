package command.banco;

import command.Command;

import java.math.BigDecimal;

public class Saque {

    public void sacar(BigDecimal bigDecimal, Command command) {
        command.efetuarSaque(bigDecimal);
    }
}
