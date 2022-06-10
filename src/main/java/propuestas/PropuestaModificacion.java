package propuestas;

import quemepongo.Guardarropas;

public abstract class PropuestaModificacion {
  EstadoPropuesta estado;
  void aceptarEn(Guardarropas guardarropas) {
    this.estado = EstadoPropuesta.ACEPTADA;
    this.realizarAceptacionEn(guardarropas);
  }

  void rechazar() {
    this.estado = EstadoPropuesta.RECHAZADA;
  }

  public void realizarAceptacionEn(Guardarropas guardarropas) {}

  public EstadoPropuesta getEstado() {
    return this.estado;
  }

  public void deshacerEn(Guardarropas guardarropas) {}
}
