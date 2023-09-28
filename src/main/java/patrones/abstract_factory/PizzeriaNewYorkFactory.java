package patrones.abstract_factory;

import patrones.abstract_factory.producto.PizzaNewYorkItaliana;
import patrones.abstract_factory.producto.PizzaNewYorkPeperoni;
import patrones.abstract_factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {


        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "peperoni" -> new PizzaNewYorkPeperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
