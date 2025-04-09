package view;

import model.Persona;
import java.util.List;

public class PersonaView {

    public void mostrarPersona(Persona p) {
        System.out.println(p);
    }

    public void mostrarLista(List<Persona> personas) {
        for (Persona p : personas) {
            mostrarPersona(p);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

