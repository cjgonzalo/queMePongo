package quemepongo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import propuestas.EstadoPropuesta;
import propuestas.PropuestaModificacion;

public class Guardarropas {
  private List<Prenda> prendas;
  private List<PropuestaModificacion> propuestas;

  public Guardarropas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public List<Atuendo> todasLasCombinacionesPosibles() {
    List<Prenda> partesSuperiores = this.filtrarPorCategoria(CategoriaPrenda.PARTE_SUPERIOR);
    List<Prenda> partesInferiores = this.filtrarPorCategoria(CategoriaPrenda.PARTE_INFERIOR);
    List<Prenda> calzados = this.filtrarPorCategoria(CategoriaPrenda.CALZADO);
    List<Prenda> accesorios = this.filtrarPorCategoria(CategoriaPrenda.ACCESORIO);
    return this.generarAtuendos(partesSuperiores, partesInferiores, calzados, accesorios);
  }

  private List<Prenda> filtrarPorCategoria(CategoriaPrenda categoria) {
    return this.prendas.stream().filter(prenda -> prenda.getCategoria().equals(categoria.toString())).collect(Collectors.toList());
  }

  private List<Atuendo> generarAtuendos(List<Prenda> partesSuperiores, List<Prenda> partesInferiores, List<Prenda> calzados, List<Prenda> accesorios) {
    List<Atuendo> atuendos = new ArrayList<>();
    return atuendos;
  }

  public List<PropuestaModificacion> propuestasPendientes() {
    return propuestas.stream().filter(propuesta -> propuesta.getEstado().equals(EstadoPropuesta.PENDIENTE)).collect(Collectors.toList());
  }
}
