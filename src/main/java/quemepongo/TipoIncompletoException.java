package quemepongo;

public class TipoIncompletoException extends PrendaIncompletaException {
  @Override
  public String message() {
    return "El tipo de prenda no debe estár incompleto";
  }
}
