package queMePongo;

public class TramaInvalidaException extends PrendaIncompletaException {
  @Override
  public String message() {
    return super.message() + "trama";
  }
}
