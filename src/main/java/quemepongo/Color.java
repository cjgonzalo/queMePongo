package quemepongo;

public class Color {
  int cantidadRojo;
  int cantidadVerde;
  int cantidadAzul;

  int getCantidadRojo() {
    return cantidadRojo;
  }

  int getCantidadVerde() {
    return cantidadVerde;
  }

  int getCantidadAzul() {
    return cantidadAzul;
  }

  public Color(int cantidadRojo, int cantidadVerde, int cantidadAzul) {
    this.cantidadRojo = cantidadRojo;
    this.cantidadVerde = cantidadVerde;
    this.cantidadAzul = cantidadAzul;
  }
}
