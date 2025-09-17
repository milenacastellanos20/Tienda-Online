public interface Vendible {
    int vender(int cantidad);
    int reponer(int cantidad);
    boolean estaDisponible(int cantidad);
    //me niego a usar esto a menos que sea obligatorio para finalizar el ejercicio
}
