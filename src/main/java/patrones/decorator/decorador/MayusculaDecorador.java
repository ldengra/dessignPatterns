package patrones.decorator.decorador;

import patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorado{
    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
