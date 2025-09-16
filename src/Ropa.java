public class Ropa extends Producto{
    private Tallas talla;
    private Materiales material;
    private final double IVA_ROPA = 0.1;

    public Ropa(int id, String nombre, double precio, int stock, Tallas talla, Materiales material) {
        super(id, nombre, precio, stock);
        this.talla = talla;
        this.material = material;
    }

    public Tallas getTalla() {
        return talla;
    }

    public void setTalla(Tallas talla) {
        this.talla = talla;
    }

    public Materiales getMaterial() {
        return material;
    }

    public void setMaterial(Materiales material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ropa: " +
                "talla: " + talla +
                ", material: " + material;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() * getStock() * IVA_ROPA;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(this.toString());
    }
}
