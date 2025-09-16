public interface Vendible {

    // no se para que sirve crear esto si no lo estamos usando
    int vender(int cantidad);
    int reponer(int cantidad);
    boolean estaDisponible(int cantidad);
}
