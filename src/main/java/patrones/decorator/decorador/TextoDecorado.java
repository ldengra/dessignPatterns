package patrones.decorator.decorador;

import patrones.decorator.Formateable;

abstract public class TextoDecorado implements Formateable {

    protected Formateable texto;

    public TextoDecorado(Formateable texto) {
        this.texto = texto;
    }
}
