package patrones.decorator2;

import patrones.decorator2.decorador.ConChocolateDecorador;
import patrones.decorator2.decorador.ConCremaDecorador;
import patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {

    public static void main(String[] args) {
        Configurable cafe = new Cafe(7,"Cafe Mocha");

        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes del cafe son: " + conChocolate.getIngredientes());
    }
}
