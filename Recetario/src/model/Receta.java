package model;

import java.util.ArrayList;
import java.util.List;
import patterns.prototype.ClonableReceta;

public class Receta implements ClonableReceta, Cloneable {
    private String nombre;
    private List<String> ingredientes = new ArrayList<>();

    public Receta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarIngrediente(String i) {
        ingredientes.add(i);
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public Receta clonar() {
        try {
            Receta clon = (Receta) this.clone();
            clon.ingredientes = new ArrayList<>(this.ingredientes); // Clon profundo de la lista
            return clon;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return nombre + " => " + ingredientes.toString();
    }
}
