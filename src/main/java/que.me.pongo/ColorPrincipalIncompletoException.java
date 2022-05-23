package que.me.pongo;

public class ColorPrincipalIncompletoException extends PrendaIncompletaException {
  public String message() {
    return super.message() + "color principal";
  }
}
