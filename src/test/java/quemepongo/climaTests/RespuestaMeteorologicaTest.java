package quemepongo.climaTests;

import clima.EstadoDelTiempo;
import clima.EstadoHumedad;
import clima.RespuestaMeteorologica;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;

public class RespuestaMeteorologicaTest {
  @Test
  public void validarPeriodoExpiracion() {
    EstadoDelTiempo clima = new EstadoDelTiempo(8.2, EstadoHumedad.LLUVIOSO);
    LocalDateTime validez = LocalDateTime.now().plus(150, ChronoUnit.MINUTES);
    RespuestaMeteorologica respuestaMeteorologica = new RespuestaMeteorologica(clima, validez);
    assertFalse(respuestaMeteorologica.expiro());
  }
}
