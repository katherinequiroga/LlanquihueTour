package main;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import model.Turista;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        int opcion;
        
        do {
            String menu = "=== SISTEMA LLANQUIHUE TOUR ===\n"
                        + "1. Registrar Guia\n"
                        + "2. Registrar Vehiculo\n"
                        + "3. Registrar Turista\n"
                        + "4. Mostrar Todos\n"
                        + "5. Salir\n"
                        + "Seleccione una opcion:";
            
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break; // Si le da cancelar
            
            opcion = Integer.parseInt(input);
            
            switch(opcion) {
                case 1: // Registrar Guia
                    String nombreG = JOptionPane.showInputDialog("Nombre del Guia:");
                    String esp = JOptionPane.showInputDialog("Especialidad:");
                    int exp = Integer.parseInt(JOptionPane.showInputDialog("Años de experiencia:"));
                    gestor.agregar(new GuiaTuristico(nombreG, esp, exp));
                    JOptionPane.showMessageDialog(null, "Guia registrado!");
                    break;
                    
                case 2: // Registrar Vehiculo
                    String patente = JOptionPane.showInputDialog("Patente:");
                    String tipo = JOptionPane.showInputDialog("Tipo: Van, Bus, Auto");
                    int cap = Integer.parseInt(JOptionPane.showInputDialog("Capacidad:"));
                    gestor.agregar(new Vehiculo(patente, tipo, cap));
                    JOptionPane.showMessageDialog(null, "Vehiculo registrado!");
                    break;
                    
                case 3: // Registrar Turista
                    String nombreT = JOptionPane.showInputDialog("Nombre del Turista:");
                    String rut = JOptionPane.showInputDialog("RUT:");
                    String ciudad = JOptionPane.showInputDialog("Ciudad de origen:");
                    gestor.agregar(new Turista(nombreT, rut, ciudad));
                    JOptionPane.showMessageDialog(null, "Turista registrado!");
                    break;
                    
                case 4: // Mostrar Todos
                    gestor.mostrarTodos();
                    JOptionPane.showMessageDialog(null, "Revisa la consola para ver el resumen");
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            
        } while(opcion != 5);
    }
}