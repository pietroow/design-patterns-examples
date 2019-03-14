package builder;

public final class PizzaBuilder {
    private String sabor;
    private String tamanho;
    private Double preco;
    private String tempoDePreparo;

    private PizzaBuilder() {
    }

    public static PizzaBuilder aPizza() {
        return new PizzaBuilder();
    }

    public PizzaBuilder withSabor(String sabor) {
        this.sabor = sabor;
        return this;
    }

    public PizzaBuilder withTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder withPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    public PizzaBuilder withTempoDePreparo(String tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setSabor(sabor);
        pizza.setTamanho(tamanho);
        pizza.setPreco(preco);
        pizza.setTempoDePreparo(tempoDePreparo);
        return pizza;
    }
}
