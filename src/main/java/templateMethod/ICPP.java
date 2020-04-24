package templateMethod;

import strategy.Imposto;
import strategy.Orcamento;

import java.math.BigDecimal;

public class ICPP extends ImpostoTemplate {

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    BigDecimal maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

    @Override
    BigDecimal minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

    @Override
    boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return false;
    }
}
