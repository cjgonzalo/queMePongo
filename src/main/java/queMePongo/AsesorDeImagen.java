package queMePongo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import clima.EstadoDelTiempo;
import clima.ServicioMeteorologicoAccuWeather;
import queMePongo.Atuendo;
import queMePongo.Guardarropas;

public class AsesorDeImagen {
  private ServicioMeteorologicoAccuWeather servicioMeteorologicoAccuWeather;

  public AsesorDeImagen(ServicioMeteorologicoAccuWeather servicio) {
    this.servicioMeteorologicoAccuWeather = servicio;
  }

  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologicoAccuWeather.obtenerCondicionesClimaticas(direccion);
    List<Atuendo> combinaciones = guardarropas.todasLasCombinacionesPosibles();
    return this.elegirAtuendo(combinaciones, estadoDelTiempo);
  }

  private Atuendo elegirAtuendo(List<Atuendo> opciones, EstadoDelTiempo clima) {
    return opciones.stream()
          .filter(opcion -> opcion.aptoParaTemperatura(clima.getTemperatura()))
          .collect(Collectors.toList())
          .get(0);
  }
}
