import java.util.ArrayList;
import java.util.Scanner;

public class Inventario{
    Scanner sc = new Scanner(System.in);

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
        inicializarInventario();
    }

    public void inicializarInventario() {
        productos.add(new Electronico(1, "TV", 399, 2, "Samsung", 5));
        productos.add(new Electronico(3, "Movil", 400, 9, "Samsung", 1));
        productos.add(new Ropa(33, "Vestido", 25, 10, Tallas.S, Materiales.seda));
        productos.add(new Ropa(8, "camiseta", 24.5, 2, Tallas.M, Materiales.Algodon));
    }

    public void insertarElectronico() {
        System.out.println("introduce id: ");
        int idElectronico = sc.nextInt();
        sc.nextLine();

        System.out.println("nombre: ");
        String nombreElectronico = sc.nextLine();

        System.out.println("precio: ");
        double precioElectronico = sc.nextDouble();

        System.out.println("stock: ");
        int stockElectronico = sc.nextInt();
        sc.nextLine();

        System.out.println("marca: ");
        String marcaElectronico = sc.nextLine();

        System.out.println("garantia: ");
        int garantiaElectronico = sc.nextInt();

        Electronico electronico = new Electronico(idElectronico, nombreElectronico, precioElectronico, stockElectronico, marcaElectronico, garantiaElectronico);
        productos.add(electronico);
        System.out.println("Producto añadido correctamente");
    }

    public void insertarRopa() {
        System.out.println("id: ");
        int idRopa = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        System.out.println("nombre: ");
        String nombreRopa = sc.nextLine();

        System.out.println("precio: ");
        double precioRopa = sc.nextDouble();

        System.out.println("stock: ");
        int stockRopa = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        System.out.println("talla: ");
        Tallas tallaRopa = Tallas.valueOf(sc.next());

        System.out.println("material: ");
        Materiales materialRopa = Materiales.valueOf(sc.next());

        Ropa ropa = new Ropa(idRopa, nombreRopa, precioRopa, stockRopa, tallaRopa, materialRopa);
        productos.add(ropa);
        System.out.println("Producto añadido correctamente");
    }

    public void mostrarInventario() {
        double valorInventario = 0;
        for (Producto producto : productos) {
            System.out.println(producto);
            valorInventario += producto.calcularPrecio();
        }
        System.out.println("Valor inventario: " + valorInventario);
    }


    public void vender(int id, int cantidad) throws ProductoNoInventarioException {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                if (producto.getStock() >= cantidad) {
                producto.setStock(producto.getStock() - cantidad);
                    System.out.println("Stock actualizado: "  + producto.getStock());
                } else {
                    throw new ProductoNoInventarioException("Stock insuficiente, disponible: "  + producto.getStock());
                }
            } else {
                throw new ProductoNoInventarioException("Producto no encontrado");
            }
            }
    }


    public void reponer(int id, int cantidad) throws ProductoNoInventarioException {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setStock(producto.getStock() + cantidad);
            } else {
                throw new ProductoNoInventarioException("Producto no encontrado");
            }
        }
    }
}
