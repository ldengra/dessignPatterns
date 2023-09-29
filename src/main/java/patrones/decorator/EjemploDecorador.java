package patrones.decorator;

import patrones.decorator.decorador.MayusculaDecorador;
import patrones.decorator.decorador.RemplazarEspacioDecorador;
import patrones.decorator.decorador.ReversaDecorador;
import patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {

    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Luis!!");

        MayusculaDecorador mayusculaDecorador = new MayusculaDecorador(texto);
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculaDecorador);
        SubrayadoDecorador subrayadoDecorador = new SubrayadoDecorador(reversaDecorador);
        RemplazarEspacioDecorador remplazarEspacioDecorador = new RemplazarEspacioDecorador(subrayadoDecorador);

        System.out.println(remplazarEspacioDecorador.darFormato());

    }
}
