package que.me.pongo;

public enum TipoPrenda {
  REMERA(CategoriaPrenda.PARTE_SUPERIOR),
  CAMISA_MANGA_CORTA(CategoriaPrenda.PARTE_SUPERIOR),
  CAMISA_MANGA_LARGA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON_CORTO(CategoriaPrenda.PARTE_INFERIOR),
  PANTALON_LARGO(CategoriaPrenda.PARTE_INFERIOR),
  ZAPATOS(CategoriaPrenda.CALZADO),
  OJOTAS(CategoriaPrenda.CALZADO),
  ANILLO(CategoriaPrenda.ACCESORIO),
  COLLAR(CategoriaPrenda.ACCESORIO),
  ARO(CategoriaPrenda.ACCESORIO);

  private CategoriaPrenda categoria;
  private TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public String getCategoria() {
    return categoria.toString();
  }
}


