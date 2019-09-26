package strategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public static void main(String[] args) {

        BigDecimal valor = BigDecimal.valueOf(10000);

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(valor);

        calcular(orcamento, icms);
        calcular(orcamento, iss);
        calcular(orcamento, iccc);

    }

    public static void calcular(Orcamento orcamento, Imposto imposto) {
        BigDecimal resultado = imposto.calcula(orcamento);
        System.out.println(resultado);
    }
}
