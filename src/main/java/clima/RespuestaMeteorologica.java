package clima;

import java.time.LocalDateTime;

public class RespuestaMeteorologica {
  EstadoDelTiempo estadoDelTiempo;
  LocalDateTime expiracion;

  public RespuestaMeteorologica(EstadoDelTiempo estadoDelTiempo, LocalDateTime expiracion) {
    this.estadoDelTiempo = estadoDelTiempo;
    this.expiracion = expiracion;
  }

  public boolean expiro() {
    return expiracion.isAfter(LocalDateTime.now());
  }

  public LocalDateTime getProximaExpiracion() {
    return expiracion;
  }
}
