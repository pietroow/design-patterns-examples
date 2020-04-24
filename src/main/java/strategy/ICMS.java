package strategy;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS() {
    }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }

}
