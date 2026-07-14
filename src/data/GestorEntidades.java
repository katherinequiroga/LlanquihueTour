package data;

import model.Registrable;
import java.util.ArrayList;

public class GestorEntidades {
    private ArrayList<Registrable> lista; // Colección genérica

    public GestorEntidades() {
        lista = new ArrayList<>();
    }

    public void agregar(Registrable r) {
        lista.add(r);
    }

    public void mostrarTodos() {
        if (lista.isEmpty()) {
            System.out.println("No hay entidades registradas.");
            return;
        }
        for (Registrable r : lista) {
            r.mostrarResumen(); // Polimorfismo
            
            // Uso de instanceof
            if (r instanceof model.GuiaTuristico) {
                System.out.println(" -> Es un Guia");
            } else if (r instanceof model.Vehiculo) {
                System.out.println(" -> Es un Vehiculo");
            } else if (r instanceof model.Turista) {
                System.out.println(" -> Es un Turista");
            }
            System.out.println("--------------------");
        }
    }
}