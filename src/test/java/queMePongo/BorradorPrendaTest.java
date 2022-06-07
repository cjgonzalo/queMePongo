package queMePongo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BorradorPrendaTest {
  private static TipoPrenda tipo;
  private static Material material;
  private static Color colorPrincipal;
  private static Color colorSecundario;
  private static Trama trama;

  @BeforeAll
  public static void initialize() {
    tipo = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
    material = Material.TELA;
    colorPrincipal = new Color(125, 255, 83);
    colorSecundario = new Color(120, 40, 90);
    trama = Trama.RAYADA;
  }
  @Test
  public void unBorradorNoPuedeGuardarUnTipoNulo() {
    assertThrows(TipoIncompletoException.class, this::borradorConTipoNulo);
  }

  @Test
  public void unBorradorPuedeNoTenerColorSecundario() {
    assertNull(borradorConColorSecundarioNulo().getColorSecundario());
  }

  @Test
  public void unaPrendaSePuedeCrearAPartirDeUnBorrador() {
    Prenda prenda = prendaDesdeBorrador();
    assertEquals(prenda.getTipo(), tipo);
    assertEquals(prenda.getMaterial(), material);
    assertEquals(prenda.getColorPrincipal(), colorPrincipal);
    assertEquals(prenda.getColorSecundario(), colorSecundario);
    assertEquals(prenda.getTrama(), trama);
  }

  @Test
  public void laTramaPorDefaultEsLisa() {
    assertEquals(prendaConTramaPorDefault().getTrama(), Trama.LISA);
  }

  @Test
  public void sePuedeGuardarUnBorradorIncompleto() {
    assertEquals(borradorInompleto().getMaterial(), null);
  }

  @Test
  public void noSePuedeGuardarUnaPrendaIncompleta() {
    BorradorPrenda borrador = borradorInompleto();
    assertThrows(MaterialIncompletoException.class, () -> borrador.crearPrenda());
  }

  public void borradorConTipoNulo() {
    new BorradorPrenda(null);
  }

  public BorradorPrenda borradorConColorSecundarioNulo() {
    BorradorPrenda borrador = new BorradorPrenda(tipo);
    borrador.especificarColorSecundario(null);
    return borrador;
  }

  public Prenda prendaDesdeBorrador() {
    BorradorPrenda borrador = new BorradorPrenda(tipo);
    borrador.especificarMaterial(material);
    borrador.especificarColorPrincipal(colorPrincipal);
    borrador.especificarColorSecundario(colorSecundario);
    borrador.especificarTrama(trama);
    return borrador.crearPrenda();
  }

  public Prenda prendaConTramaPorDefault() {
    BorradorPrenda borrador = new BorradorPrenda(tipo);
    borrador.especificarMaterial(material);
    borrador.especificarColorPrincipal(colorPrincipal);
    borrador.especificarColorSecundario(colorSecundario);
    borrador.especificarTrama(null);
    return borrador.crearPrenda();
  }

  public BorradorPrenda borradorInompleto() {
    BorradorPrenda borrador = new BorradorPrenda(tipo);
    borrador.especificarColorPrincipal(colorPrincipal);
    return borrador;
  }
}
