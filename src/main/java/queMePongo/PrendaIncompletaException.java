package queMePongo;

public class PrendaIncompletaException extends RuntimeException {
  public String message() {
    return "La prenda está incompleta, falta cargar el campo";
  }
}
