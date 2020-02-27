package templateMethod;

import strategy.Orcamento;

import java.math.BigDecimal;

public class ICPP extends ImpostoTemplate {

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
