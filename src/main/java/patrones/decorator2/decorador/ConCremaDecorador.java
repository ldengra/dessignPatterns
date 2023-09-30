package patrones.decorator2.decorador;

import patrones.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador{
    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 10f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", crema";
    }
}
