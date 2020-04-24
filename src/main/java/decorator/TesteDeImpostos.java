package decorator;

import strategy.ICMS;
import strategy.ISS;
import strategy.Imposto;
import strategy.Orcamento;

import java.math.BigDecimal;

public class TesteDeImpostos {
    public static void main(String[] args) {
        Imposto imposto = new ImpostoMuitoAlto(new ICMS());
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(500));

        BigDecimal valor = imposto.calcula(orcamento);
        System.out.println(valor);
    }
}
