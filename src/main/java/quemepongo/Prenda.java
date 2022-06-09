package quemepongo;

import org.jetbrains.annotations.NotNull;

public class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;
  Double temperaturaMaxima;

  public String getCategoria() {
    return tipo.getCategoria();
  }

  public TipoPrenda getTipo() {
    return this.tipo;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Trama getTrama() {
    return trama;
  }

  public Boolean aptaParaTemperatura(Double temperatura) {
    return temperatura < temperaturaMaxima;
  }

  public Prenda(
      @NotNull TipoPrenda tipo,
      @NotNull Material material,
      @NotNull Color colorPrincipal,
      Color colorSecundario,
      @NotNull Trama trama
  ) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }
}