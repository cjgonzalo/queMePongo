package que.me.pongo;

import org.jetbrains.annotations.NotNull;

public class BorradorPrenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public BorradorPrenda(TipoPrenda tipo) {
    if (tipo == null) {
      throw new TipoIncompletoException();
    } else {
      this.tipo = tipo;
    }
  }

  public TipoPrenda getTipo() {
    return this.tipo;
  }

  public void especificarMaterial(Material material) {
    this.material = material;
  }

  public Material getMaterial() {
    return this.material;
  }

  public void especificarColorPrincipal(Color color) {
    this.colorPrincipal = color;
  }

  public Color getColorPrincipal() {
    return this.colorPrincipal;
  }

  public void especificarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public Color getColorSecundario() {
    return this.colorSecundario;
  }

  public void especificarTrama(Trama trama) {
    if (trama == null) {
      this.trama = Trama.LISA;
    } else {
      this.trama = trama;
    }
  }

  public Trama getTrama() {
    return this.trama;
  }

  public Prenda crearPrenda() {
    if (this.material == null) {
      throw new MaterialIncompletoException();
    } else if (this.colorPrincipal == null) {
      throw new ColorPrincipalIncompletoException();
    }
    return new Prenda(
        this.tipo,
        this.material,
        this.colorPrincipal,
        this.colorSecundario,
        this.trama
    );
  }
}
