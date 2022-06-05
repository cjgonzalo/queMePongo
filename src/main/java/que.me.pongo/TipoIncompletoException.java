package que.me.pongo;

public class TipoIncompletoException extends PrendaIncompletaException {
  @Override
  public String message() {
    return super.message() + "tipo de prenda";
  }
}
