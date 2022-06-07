package clima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class ServicioMeteorologico {
  private AccuWeatherAPI api;
  private Duration expiracion;
  private String direccion;
  private Map<String, Object> ultimaRespuesta;
  private LocalDateTime proximaExpiracion;

  public ServicioMeteorologico(AccuWeatherAPI api, Duration expiracion, String direccion) {
    this.api = api;
    this.expiracion = expiracion;
    this.direccion = direccion;
  }

  public Map<String, Object> obtenerCondicionesClimaticas() {
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = consultarApi();
      this.proximaExpiracion = LocalDateTime.now().plus(this.expiracion);
    }
    return this.ultimaRespuesta;
  }

  private boolean expiro() {
    return proximaExpiracion.isAfter(LocalDateTime.now());
  }

  private Map<String, Object> consultarApi() {
    return api.getWeather(direccion).get(0);
  }

  public String getDireccion() {
    return direccion;
  }

  public LocalDateTime getProximaExpiracion() {
    return proximaExpiracion;
  }
}
