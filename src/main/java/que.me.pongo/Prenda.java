package que.me.pongo;

import org.jetbrains.annotations.NotNull;

public class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;

  public String getCategoria() {
    return tipo.getCategoria();
  }

  private void setTipo(@NotNull TipoPrenda tipo) {
    if (tipo.equals(null)) {
      throw new TipoIncompletoException();
    } else {
      this.tipo = tipo;
    }
  }

  private void setMaterial(@NotNull Material material) {
    if (material.equals(null)) {
      throw new MaterialIncompletoException();
    } else {
      this.material = material;
    }
  }

  private void setColorPrincipal(@NotNull Color color) {
    if (color.equals(null)) {
      throw new ColorPrincipalIncompletoException();
    } else {
      this.colorPrincipal = color;
    }
  }

  public Prenda(
      @NotNull TipoPrenda tipo,
      @NotNull Material material,
      @NotNull Color colorPrincipal,
      Color colorSecundario
  ) {
    try {
      setTipo(tipo);
      setMaterial(material);
      setColorPrincipal(colorPrincipal);
    } catch (PrendaIncompletaException e) {
      e.message();
    }

    this.colorSecundario = colorSecundario;
  }
}