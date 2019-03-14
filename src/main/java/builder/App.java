package builder;

public class App {
    public static void main(String[] args) {

        Pizza pizza = PizzaBuilder.aPizza()
                .withPreco(22.90)
                .withTempoDePreparo("2 HORAS")
                .withSabor("PORTUGUESA")
                .withTamanho("MEDIO")
                .build();

        System.out.println(pizza);

    }
}

