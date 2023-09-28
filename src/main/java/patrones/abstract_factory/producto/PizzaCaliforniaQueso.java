package patrones.abstract_factory.producto;

import patrones.abstract_factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra Queso mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min a 100C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
