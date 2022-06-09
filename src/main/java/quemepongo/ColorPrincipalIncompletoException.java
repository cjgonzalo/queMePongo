package quemepongo;

public class ColorPrincipalIncompletoException extends PrendaIncompletaException {
  @Override
  public String message() {
    return super.message() + "color principal";
  }
}
