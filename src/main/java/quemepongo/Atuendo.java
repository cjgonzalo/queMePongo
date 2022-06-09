package quemepongo;

public class Atuendo {
  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;
  private Prenda accesorios;

  public Atuendo(
      Prenda parteSuperior,
      Prenda parteInferior,
      Prenda calzado,
      Prenda accesorios
  ) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.accesorios = accesorios;
  }

  public Prenda getParteSuperior() {
    return parteSuperior;
  }

  public Prenda getParteInferior() {
    return parteInferior;
  }

  public Prenda getCalzado() {
    return calzado;
  }

  public Prenda getAccesorios() {
    return accesorios;
  }

  public Boolean aptoParaTemperatura(Double temperatura) {
    return parteSuperior.aptaParaTemperatura(temperatura) &&
           parteInferior.aptaParaTemperatura(temperatura) &&
           calzado.aptaParaTemperatura(temperatura) &&
           accesorios.aptaParaTemperatura(temperatura);
  }
}
