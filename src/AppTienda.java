import java.util.Scanner;

public class AppTienda {
     static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int menu = 0;
         int opcion = 0;
         int id = 0;
         int cantidad = 0;
         int i;
         Inventario inventario = new Inventario();

      try {
          do {
              System.out.println("Bienvenido a Tienda...");
              for (i = 0; i < 1; i++) {

                  System.out.println("1. Añadir productos al inventario");
                  System.out.println("2. Vender productos, actualizando la cantidad en stock");
                  System.out.println("3. Reponer productos en el inventario");
                  System.out.println("4. Mostrar todos los productos");
                  System.out.println("5. Salir");

                  System.out.println("Seleccione una opcion: ");
                  menu = sc.nextInt();

                  switch (menu) {
                      case 1:
                          System.out.println("Que producto desea insertar? 1. Electronico. 2. Ropa");
                          opcion = sc.nextInt();
                          if (opcion == 1) {
                              inventario.insertarElectronico();
                          }  else if (opcion == 2) {
                              inventario.insertarRopa();
                          } else {
                              throw new Exception("Opcion invalida");
                          }
                      case 2:
                          System.out.println("Indique el id del producto: ");
                          id = sc.nextInt();
                          System.out.println("Indique el cantidad del producto: ");
                          cantidad = sc.nextInt();

                          inventario.vender(id, cantidad);
                      case 3:
                          System.out.println("Indique el id del producto: ");
                          id = sc.nextInt();
                          System.out.println("Indique el cantidad del producto: ");
                          cantidad = sc.nextInt();

                          inventario.reponer(id, cantidad);
                      case 4:
                          inventario.mostrarInventario();
                  }
                  if (menu < 5) {
                      i--;
                  } else if (menu > 5) {
                      System.out.println("Opcion invalida");
                      i--;
                  } else {
                      System.out.println("Saliendo");
                      break;
                  }
              }

          }while (menu > 0 && menu < 5);

      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }
}
