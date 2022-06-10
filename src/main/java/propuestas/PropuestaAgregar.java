package propuestas;

import quemepongo.Guardarropas;
import quemepongo.Prenda;

public class PropuestaAgregar extends PropuestaModificacion {
  Prenda prenda;
  EstadoPropuesta estado;

  @Override
  public void aceptarEn(Guardarropas guardarropas) {
    super.aceptarEn(guardarropas);
  }

  public void realizarAceptacionEn(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(this.prenda);
  }

  @Override
  public void rechazar() {
    super.rechazar();
  }

  public EstadoPropuesta getEstado() {
    return this.estado;
  }

  public void deshacerEn(Guardarropas guardarropas) {
    guardarropas.quitarPrenda(this.prenda);
  }
}
