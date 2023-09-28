package patrones.abstract_factory.ejemplo;

import patrones.abstract_factory.PizzaProducto;
import patrones.abstract_factory.PizzeriaCaliforniaFactory;
import patrones.abstract_factory.PizzeriaNewYorkFactory;
import patrones.abstract_factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {

    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("Andres ordena una " +pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena una " +pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena una " +pizza.getNombre());

        pizza = california.ordenarPizza("peperoni");
        System.out.println("Linus ordena una " +pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
