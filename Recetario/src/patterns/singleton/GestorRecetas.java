package patterns.singleton;

import java.util.ArrayList;
import java.util.List;
import model.Receta;

public class GestorRecetas {
    private static GestorRecetas instancia;
    private List<Receta> recetas = new ArrayList<>();

    private GestorRecetas() {}

    public static GestorRecetas getInstancia() {
        if (instancia == null) {
            instancia = new GestorRecetas();
        }
        return instancia;
    }

    public void agregar(Receta r) {
        recetas.add(r);
    }

    public void mostrarRecetas() {
        for (Receta r : recetas) {
            System.out.println(r);
        }
    }

    public List<Receta> getRecetas() {
        return recetas;
    }
}
