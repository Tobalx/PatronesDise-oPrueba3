package patterns.adapter;

import model.Receta;

public class AdaptadorMexicano implements RecetaInternacional {
    private Receta receta;

    public AdaptadorMexicano(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String mostrar() {
        String texto = receta.toString();
        return texto.replace("Palta", "Aguacate");
    }
}
