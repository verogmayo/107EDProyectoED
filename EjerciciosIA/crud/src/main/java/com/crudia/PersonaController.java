package controller;

import model.Persona;
import view.PersonaView;
import java.util.*;

public class PersonaController {
    private List<Persona> personas = new ArrayList<>();
    private PersonaView view = new PersonaView();

    public void crearPersona(int id, String nombre, int edad) {
        personas.add(new Persona(id, nombre, edad));
        view.mostrarMensaje("Persona creada.");
    }

    public void listarPersonas() {
        view.mostrarLista(personas);
    }

    public void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                view.mostrarMensaje("Persona actualizada.");
                return;
            }
        }
        view.mostrarMensaje("Persona no encontrada.");
    }

    public void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        view.mostrarMensaje("Persona eliminada si existía.");
    }
}

