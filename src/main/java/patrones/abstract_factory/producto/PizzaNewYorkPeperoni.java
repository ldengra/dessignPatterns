package patrones.abstract_factory.producto;

import patrones.abstract_factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza peperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 45 min. a 90.C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos.");
    }
}
