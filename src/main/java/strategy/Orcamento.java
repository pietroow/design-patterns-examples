package strategy;

import state.EmAprovacao;
import state.EstadoDeUmOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private List<Item> itens = new ArrayList<>();
    private EstadoDeUmOrcamento estadoAtual;

    private Orcamento(){
        this.estadoAtual = new EmAprovacao();
    }

    public Orcamento(BigDecimal valor) {
        this();
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }

    public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
