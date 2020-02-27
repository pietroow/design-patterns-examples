package state;

import strategy.Orcamento;

import java.math.BigDecimal;

public class EmAprovacao implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        BigDecimal desconto = orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
        orcamento.setValor(orcamento.getValor().subtract(desconto));
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }
}
