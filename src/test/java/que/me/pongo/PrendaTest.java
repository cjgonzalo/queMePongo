package que.me.pongo;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {
  private Color color;
  @BeforeEach
  public void initialize() {
    color = new Color(25, 70, 125);
  }

  @Test
  public void unaPrendaPuedeNoTenerColorSecundario() {
    assertNull(prendaSinColorSecundario().colorSecundario);
  }

  @Test
  public void lasCamisasSonDeCategoriaParteSuperior() {
    assertEquals(camisaMangaCorta().getCategoria(), CategoriaPrenda.PARTE_SUPERIOR.toString());
    assertEquals(camisaMangaLarga().getCategoria(), CategoriaPrenda.PARTE_SUPERIOR.toString());
  }

  private Prenda prendaSinColorSecundario() {
    return new Prenda(TipoPrenda.PANTALON_CORTO, Material.TELA, color, null);
  }

  private Prenda camisaMangaCorta() {
    return new Prenda(TipoPrenda.CAMISA_MANGA_CORTA, Material.TELA, color, color);
  }

  private Prenda camisaMangaLarga() {
    return new Prenda(TipoPrenda.CAMISA_MANGA_LARGA, Material.TELA, color, color);
  }
}
