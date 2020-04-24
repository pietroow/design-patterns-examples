package strategy;

import java.math.BigDecimal;

public class ICCC extends Imposto {

    public ICCC() {
    }

    public ICCC(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        BigDecimal valor = orcamento.getValor();
        if (valor.compareTo(BigDecimal.valueOf(1000)) < 0) {
            return valor.multiply(BigDecimal.valueOf(0.05));
        } else if (valor.compareTo(BigDecimal.valueOf(3000)) <= 0) {
            return valor.multiply(BigDecimal.valueOf(0.07));
        } else {
            BigDecimal taxaFixa = BigDecimal.valueOf(30);
            BigDecimal juros = valor.multiply(BigDecimal.valueOf(0.08));
            return juros.add(taxaFixa);
        }
    }

}
