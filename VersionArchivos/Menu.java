package VersionArchivos;

import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<ObjArchivos> archivo = new Stack<>();
        boolean continuar = true;
        int contadorVersion = 1;

        System.out.println();
        System.out.println("===  Versionamiento de Archivos ===");

        while (continuar) {
            System.out.println();
            System.out.println("Ingrese una opción");
            System.out.println("1) Registrar Versión");
            System.out.println("2) Versión anterior");
            System.out.println("3) Versión actual");
            System.out.println("4) Mostrar versiones");
            System.out.println("5) Salir");
            System.out.print("Opción: ");
            int opt = m.ValidarEntero(sc);
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println();
                    archivo = m.CrearVersion(archivo, sc, contadorVersion);
                    contadorVersion++;
                    break;
                case 2:
                    archivo = m.VersionAnterior(archivo);
                    break;
                case 3:
                    ObjArchivos actual = m.VersionActual(archivo);
                    if (actual != null) {
                        System.out.println("Version: " + actual.getVersion() + " | Archivo: " + actual.getNombre()
                                + " | Descripción: " + actual.getDescripcion() + " | Fecha: " + actual.getFecha());
                    }
                    break;
                case 4:
                    m.MostrarVersiones(archivo);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        sc.close();
    }

}
