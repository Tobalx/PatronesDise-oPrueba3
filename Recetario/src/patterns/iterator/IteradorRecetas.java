package patterns.iterator;

import java.util.List;
import model.Receta;

public class IteradorRecetas {
    private List<Receta> recetas;
    private int posicion = 0;

    public IteradorRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public boolean tieneSiguiente() {
        return posicion < recetas.size();
    }

    public Receta siguiente() {
        return recetas.get(posicion++);
    }
}
