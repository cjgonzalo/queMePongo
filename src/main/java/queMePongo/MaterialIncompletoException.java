package queMePongo;

public class MaterialIncompletoException extends PrendaIncompletaException {
  @Override
  public String message() {
    return super.message() + "material";
  }
}
