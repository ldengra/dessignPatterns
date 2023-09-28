package patrones.abstract_factory.producto;

import patrones.abstract_factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza California Peperoni";
        masa = "Masa a la piedra gruesa";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min. a 55.C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en peque;os rectangulos.");
    }
}
