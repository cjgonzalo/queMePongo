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
    TipoPrenda pantalonCorto = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR);
    return new Prenda(pantalonCorto, Material.TELA, color, null, Trama.CUADROS);
  }

  private Prenda camisaMangaCorta() {
    TipoPrenda camisaMangaCorta = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
    return new Prenda(camisaMangaCorta, Material.TELA, color, color, Trama.LISA);
  }

  private Prenda camisaMangaLarga() {
    TipoPrenda camisaMangaLarga = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
    return new Prenda(camisaMangaLarga, Material.TELA, color, color, Trama.RAYADA);
  }
}
