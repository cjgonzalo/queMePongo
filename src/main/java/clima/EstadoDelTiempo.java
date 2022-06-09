package clima;

public class EstadoDelTiempo {
  String direccion;
  Double temperatura;
  EstadoHumedad humedad;

  public EstadoDelTiempo(Double temperatura, EstadoHumedad humedad) {
    this.temperatura = temperatura;
    this.humedad = humedad;
  }

  public Double getTemperatura() {
    return temperatura;
  }

  public EstadoHumedad getHumedad() {
    return humedad;
  }
}
