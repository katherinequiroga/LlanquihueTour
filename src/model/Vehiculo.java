package model;

public class Vehiculo implements Registrable {
    private String patente;
    private String tipo; // Van, Bus, Auto
    private int capacidad;

    public Vehiculo(String patente, String tipo, int capacidad) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Vehiculo: " + patente + " | Tipo: " + tipo + " | Capacidad: " + capacidad + " personas");
    }
}