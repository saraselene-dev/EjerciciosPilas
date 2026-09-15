package EditorTexto;

import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m= new Metodos();
        Stack<ObjCambioTexto>  texto = new Stack<>();
        boolean continuar = true;
        System.out.println();
        System.out.println("=== Editor Texto ===");

        while (continuar) {
            System.out.println();
            System.out.println("Ingrese una Opción");
            System.out.println("1) Registrar cambio");
            System.out.println("2) Deshacer cambio");
            System.out.println("3) Consultar último cambio");
            System.out.println("4) Mostrar historial");
            System.out.println("5) Salir");
            System.out.print("Opción: ");
            int opcion = m.ValidarEntero(sc);
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println();
                    texto = m.RegistrarCambio(texto, sc);
                    break;
                case 2:
                    ObjCambioTexto deshecho = m.DeshacerCambio(texto);
                    if (deshecho != null) {
                        System.out.println("Se deshizo el cambio de: " + deshecho.getUsuario());
                    }
                    break;
                case 3:
                    ObjCambioTexto ultimo = m.ConsultarUltimoCambio(texto);
                    if (ultimo != null) {
                        System.out.println("Usuario: " + ultimo.getUsuario());
                        System.out.println("Texto anterior: " + ultimo.getTextoAnterior());
                        System.out.println("Texto nuevo: " + ultimo.getTextoNuevo());
                        System.out.println("Fecha: " + ultimo.getFecha());
                    }
                    break;
                case 4:
                    m.MostrarHistorial(texto);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

}
