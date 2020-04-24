package decorator;

import strategy.Imposto;
import strategy.Orcamento;

import java.math.BigDecimal;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    public ImpostoMuitoAlto() {
        super();
    }

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.2))
                .add(calculoDoOutroImpost(orcamento));
    }
}
