public class Electronico extends Producto{

    private String marca;
    private int garantia;
    private final double IVA_ELECTRONICO = 0.21;

    public Electronico(int id, String nombre, double precio, int stock, String marca, int garantia) {
        super(id, nombre, precio, stock);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() * getStock() * IVA_ELECTRONICO;
    }

    @Override
    public String toString() {
        return "Electronico: " +
                "marca: " + marca +
                ", garantia: " + garantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(this.toString());
    }
}
