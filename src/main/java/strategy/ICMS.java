package strategy;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }

}
