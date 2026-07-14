package model;

public class GuiaTuristico implements Registrable {
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico(String nombre, String especialidad, int aniosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Guia: " + nombre + " | Especialidad: " + especialidad + " | Exp: " + aniosExperiencia + " años");
    }
}