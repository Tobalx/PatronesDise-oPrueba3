package main;

import model.Receta;
import patterns.singleton.GestorRecetas;
import patterns.adapter.AdaptadorMexicano;
import patterns.iterator.IteradorRecetas;

public class Recetario {
    public static void main(String[] args) {
        GestorRecetas gestor = GestorRecetas.getInstancia();

        Receta receta1 = new Receta("Pan con Palta");
        receta1.agregarIngrediente("Pan");
        receta1.agregarIngrediente("Palta");

        gestor.agregar(receta1);

        System.out.println("Todas las recetas:");
        gestor.mostrarRecetas();

        System.out.println("\nReceta adaptada a México:");
        AdaptadorMexicano adaptador = new AdaptadorMexicano(receta1);
        System.out.println(adaptador.mostrar());

        System.out.println("\nIterando recetas:");
        IteradorRecetas iterador = new IteradorRecetas(gestor.getRecetas());
        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }

        System.out.println("\nClonando receta (Prototype):");
        Receta clonada = receta1.clonar(); 
        if (clonada != null) {
            clonada.agregarIngrediente("Limón"); 
            System.out.println("Original: " + receta1);
            System.out.println("Clonada: " + clonada);
        } else {
            System.out.println("Error al clonar la receta.");
        }
    }
}