package state;

import strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
    }

    @Override
    public void aprova(Orcamento orcamento) {

    }

    @Override
    public void reprova(Orcamento orcamento) {

    }

    @Override
    public void finaliza(Orcamento orcamento) {

    }
}
