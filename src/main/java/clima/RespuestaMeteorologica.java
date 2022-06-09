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
    return LocalDateTime.now().isAfter(expiracion);
  }

  public LocalDateTime getProximaExpiracion() {
    return expiracion;
  }
}
