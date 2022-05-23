package que.me.pongo;

public class MaterialIncompletoException extends PrendaIncompletaException {
  public String message() {
    return super.message() + "material";
  }
}
