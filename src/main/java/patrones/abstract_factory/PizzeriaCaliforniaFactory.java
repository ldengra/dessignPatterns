package patrones.abstract_factory;

import patrones.abstract_factory.producto.PizzaCaliforniaPeperoni;
import patrones.abstract_factory.producto.PizzaCaliforniaQueso;
import patrones.abstract_factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "peperoni" -> new PizzaCaliforniaPeperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
