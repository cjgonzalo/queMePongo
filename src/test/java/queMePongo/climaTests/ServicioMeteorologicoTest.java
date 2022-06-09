package queMePongo.climaTests;

import clima.AccuWeatherAPI;
import clima.EstadoDelTiempo;
import clima.EstadoHumedad;
import clima.ServicioMeteorologicoAccuWeather;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ServicioMeteorologicoTest {
  AccuWeatherAPI api;
  Duration validez;
  ServicioMeteorologicoAccuWeather servicio;

  @BeforeEach
  void initialize() {
    api = new AccuWeatherAPI();
    validez = Duration.ofHours(2);
    servicio = mock(ServicioMeteorologicoAccuWeather.class);
  }

  @Test
  public void obtenerElClimaDeBuenosAires() {
    when(servicio.obtenerCondicionesClimaticas("Buenos Aires")).thenReturn(new EstadoDelTiempo(57.0, EstadoHumedad.SECO));
    assertEquals(servicio.obtenerCondicionesClimaticas("Buenos Aires").getTemperatura(), 57);
    assertEquals(servicio.obtenerCondicionesClimaticas("Buenos Aires").getHumedad(), EstadoHumedad.SECO);
  }


}
