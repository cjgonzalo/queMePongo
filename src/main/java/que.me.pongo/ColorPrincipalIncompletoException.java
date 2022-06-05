package que.me.pongo;

public class ColorPrincipalIncompletoException extends PrendaIncompletaException {
  @Override
  public String message() {
    return super.message() + "color principal";
  }
}
