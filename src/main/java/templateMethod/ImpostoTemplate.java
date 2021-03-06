package templateMethod;

import strategy.Imposto;
import strategy.Orcamento;

import java.math.BigDecimal;

public abstract class ImpostoTemplate extends Imposto {

    public ImpostoTemplate(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    abstract BigDecimal maximaTaxacao(Orcamento orcamento);

    abstract BigDecimal minimaTaxacao(Orcamento orcamento);

    abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
