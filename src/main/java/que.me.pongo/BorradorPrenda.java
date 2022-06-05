package que.me.pongo;

import org.jetbrains.annotations.NotNull;

public class BorradorPrenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public BorradorPrenda(TipoPrenda tipo) {
    try {
      validarNoNulo(tipo);
      this.tipo = tipo;
    } catch(PrendaIncompletaException e) {
      throw new TipoIncompletoException();
    }
  }

  public TipoPrenda getTipo() {
    return this.tipo;
  }

  public void especificarMaterial(Material material) {
    try {
      validarNoNulo(material);
      this.material = material;
    } catch(PrendaIncompletaException e) {
      throw new MaterialIncompletoException();
    }
  }

  public Material getMaterial() {
    return this.material;
  }

  public void especificarColorPrincipal(Color color) {
    try {
      validarNoNulo(color);
      this.colorPrincipal = color;
    } catch(PrendaIncompletaException e) {
      throw new ColorPrincipalIncompletoException();
    }
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
    if(trama == null) {
      this.trama = Trama.LISA;
    } else {
      this.trama = trama;
    }
  }

  public Trama getTrama() {
    return this.trama;
  }

  public Prenda crearPrenda() {
    return new Prenda(
        this.tipo,
        this.material,
        this.colorPrincipal,
        this.colorSecundario,
        this.trama
    );
  }

  public void validarNoNulo(Object elemento) {
    if(elemento == null) {
      throw new PrendaIncompletaException();
    }
  }
}
