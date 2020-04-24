package strategy;

import java.math.BigDecimal;

import static java.util.Objects.isNull;

public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto() {
        this.outroImposto = null;
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected BigDecimal calculoDoOutroImpost(Orcamento orcamento) {
        if (isNull(outroImposto)) return BigDecimal.ZERO;
        return outroImposto.calcula(orcamento);
    }

    public abstract BigDecimal calcula(Orcamento orcamento);

}
