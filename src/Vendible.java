public interface Vendible {
    int vender(int cantidad);
    int reponer(int cantidad);
    boolean estaDisponible(int cantidad);
}
