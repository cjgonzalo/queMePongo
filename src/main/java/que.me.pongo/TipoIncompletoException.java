package que.me.pongo;

public class TipoIncompletoException extends PrendaIncompletaException {
  public String message() {
    return super.message() + "tipo de prenda";
  }
}
