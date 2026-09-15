package VersionArchivos;

import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<ObjArchivos> CrearVersion(Stack<ObjArchivos> pila, Scanner sc, int numeroVersion) {
        System.out.print("Nombre del archivo: ");
        String archivo = sc.nextLine();
        System.out.print("Descripción: ");
        String descripcion = sc.nextLine();
        ObjArchivos a = new ObjArchivos(numeroVersion, archivo, descripcion);
        pila.push(a);
        return pila;
    }

    public Stack<ObjArchivos> VersionAnterior(Stack<ObjArchivos> pila){
    if(pila.isEmpty()){
        System.out.println("No existen versiones anteriores");
    } else {
        pila.pop();
        if (!pila.isEmpty()) {
            ObjArchivos actual = pila.peek();
            System.out.println("Volviste a la versión: " + actual.getVersion() + " - " + actual.getNombre());
        } else {
            System.out.println("No quedan más versiones anteriores");
        }
    }
    return pila;
}

    public ObjArchivos VersionActual(Stack<ObjArchivos> pila) {
        if (pila.isEmpty()) {
            System.out.println("No existen versiones registradas");
            return null;
        }
        return pila.peek();
    }

    public void MostrarVersiones(Stack<ObjArchivos> pila) {
        if (pila.isEmpty()) {
            System.out.println("No existen versiones registradas");
            return;
        }
        for (ObjArchivos objArchivos : pila) {
            System.out.println("Version: " + objArchivos.getVersion() + " | Archivo: " + objArchivos.getNombre()
                    + " | Descripción: " + objArchivos.getDescripcion() + " | Fecha: " + objArchivos.getFecha());
        }
    }

    public int ValidarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Por favor ingresar un valor numérico entero");
            sc.next();
        }
        return sc.nextInt();
    }
}
