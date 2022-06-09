package clima;

public interface ServicioMeteorologico {
  EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
  
  Double farenheitACelcius(Double temperatura);
}
