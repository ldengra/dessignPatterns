package patrones.decorator.decorador;

import patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorado{

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
