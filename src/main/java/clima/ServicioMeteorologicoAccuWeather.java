package clima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  private AccuWeatherAPI api;
  private Duration periodoValidez;
  private Map<String, RespuestaMeteorologica> ultimasRespuestas;
  private LocalDateTime proximaExpiracion;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoValidez) {
    this.api = api;
    this.periodoValidez = periodoValidez;
    this.proximaExpiracion = LocalDateTime.now().plus(periodoValidez);
    this.ultimasRespuestas = new HashMap<>();
  }

  public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
    if (!this.ultimasRespuestas.containsKey(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
      this.ultimasRespuestas.put(direccion, new RespuestaMeteorologica(consultarApi(direccion), proximaExpiracion));
      this.proximaExpiracion = LocalDateTime.now().plus(this.periodoValidez);
    }
    return this.ultimasRespuestas.get(direccion).estadoDelTiempo;
  }

  private EstadoDelTiempo consultarApi(String direccion) {
    Map<String, Object> respuesta = api.getWeather(direccion).get(0);
    double temperatura = (Double) (respuesta.get("Temperature"));
    EstadoHumedad humedad = (Double) respuesta.get("PrecipitationProbability") > 0.5 ? EstadoHumedad.HUMEDO : EstadoHumedad.SECO;
    return new EstadoDelTiempo(farenheitACelcius(temperatura), humedad);
  }

  public Double farenheitACelcius(Double temperatura) {
    return (temperatura - 32) * 5 / 9;
  }
}
