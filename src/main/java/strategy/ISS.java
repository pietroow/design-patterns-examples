package strategy;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        BigDecimal taxaFixa = BigDecimal.valueOf(50);
        BigDecimal orcamentoMaisJurosCincoPorcento = orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        return orcamentoMaisJurosCincoPorcento.add(taxaFixa);
    }

}
