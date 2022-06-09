package queMePongo;

import java.util.List;

public class Guardarropas {
  private List<Atuendo> atuendos;

  public Guardarropas(List<Atuendo> atuendos) {
    this.atuendos = atuendos;
  }

  public List<Atuendo> todasLasCombinacionesPosibles() {
    return this.atuendos;
  }
}
