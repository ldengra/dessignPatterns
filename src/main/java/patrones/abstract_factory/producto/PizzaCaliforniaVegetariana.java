package patrones.abstract_factory.producto;

import patrones.abstract_factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ light";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en renabadas rectangulares");
    }
}
