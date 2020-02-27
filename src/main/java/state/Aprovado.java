package state;

import strategy.Orcamento;

import java.math.BigDecimal;

public class Aprovado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        BigDecimal desconto = orcamento.getValor().multiply(BigDecimal.valueOf(0.02));
        orcamento.setValor(orcamento.getValor().subtract(desconto));
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está em estado de aprovação");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
