package que.me.pongo;

public class TipoPrenda {
  CategoriaPrenda categoria;

  public TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public String getCategoria() {
    return categoria.toString();
  }
}


