package que.me.pongo;

public class Atuendo {
    Prenda superior;
    Prenda inferior;
    Prenda calzado;
    Prenda accesorios;

    public Atuendo(
            Prenda superior,
            Prenda inferior,
            Prenda calzado,
            Prenda accesorios
    ) {
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
        this.accesorios = accesorios;
    }
}
