package quemepongo.climaTests;

import clima.EstadoDelTiempo;
import clima.EstadoHumedad;
import clima.ServicioMeteorologicoAccuWeather;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioMeteorologicoTest {
  ServicioMeteorologicoAccuWeather servicio;

  @BeforeEach
  public void initialize() {
    servicio = mock(ServicioMeteorologicoAccuWeather.class);
  }

  @Test
  public void obtenerElClimaDeBuenosAires() {
    when(servicio.obtenerCondicionesClimaticas("Buenos Aires")).thenReturn(new EstadoDelTiempo(57.0, EstadoHumedad.SECO));
    assertEquals(servicio.obtenerCondicionesClimaticas("Buenos Aires").getTemperatura(), 57);
    assertEquals(servicio.obtenerCondicionesClimaticas("Buenos Aires").getHumedad(), EstadoHumedad.SECO);
  }

  @Test
  public void pasajeDeFarenheitACelcius() {
    when(servicio.farenheitACelcius(43.7)).thenReturn(6.5);
    assertEquals(servicio.farenheitACelcius(43.7), 6.5);
  }
}
