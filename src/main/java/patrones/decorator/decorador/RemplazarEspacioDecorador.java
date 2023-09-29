package patrones.decorator.decorador;

import patrones.decorator.Formateable;

public class RemplazarEspacioDecorador extends TextoDecorado{
    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
