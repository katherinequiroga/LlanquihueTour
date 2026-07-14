package model;

public class Turista implements Registrable {
    private String nombre;
    private String rut;
    private String ciudadOrigen;

    public Turista(String nombre, String rut, String ciudadOrigen) {
        this.nombre = nombre;
        this.rut = rut;
        this.ciudadOrigen = ciudadOrigen;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Turista: " + nombre + " | RUT: " + rut + " | Origen: " + ciudadOrigen);
    }
}