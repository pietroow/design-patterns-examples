package strategy;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS() {
    }

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        BigDecimal taxaFixa = BigDecimal.valueOf(50);
        BigDecimal orcamentoMaisJurosCincoPorcento = orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        return orcamentoMaisJurosCincoPorcento.add(taxaFixa);
    }

}
