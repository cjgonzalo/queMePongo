package quemepongo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
  List<Guardarropas> listaGuardarropas;

  public Usuario(Guardarropas unGuardarropas, Guardarropas... otrosGuardarropas) {
    this.listaGuardarropas = new ArrayList<>();
    this.listaGuardarropas.add(unGuardarropas);
    Collections.addAll(this.listaGuardarropas, otrosGuardarropas);
  }

  public void agregarGuardarropas(Guardarropas guardarropas) {
    listaGuardarropas.add(guardarropas);
  }

  public void quitarGuardarropas(Guardarropas guardarropas) {
    listaGuardarropas.remove(guardarropas);
  }
}
