    package EditorTexto;

    import java.util.Scanner;
    import java.util.Stack;

    public class Metodos {
        public Stack<ObjCambioTexto> RegistrarCambio(Stack<ObjCambioTexto> pila, Scanner sc){
            System.out.print("Ingrese nombre de usuario: ");
            String usuario=sc.nextLine();
            System.out.print("Ingrese texto Anterior: ");
            String textoAnterior=sc.nextLine();
            System.out.print("Ingrese texto nuevo: ");
            String textoNuevo= sc.nextLine();
            ObjCambioTexto t= new ObjCambioTexto(usuario, textoAnterior, textoNuevo);
            pila.push(t);
            return pila;
        }

        public ObjCambioTexto DeshacerCambio (Stack<ObjCambioTexto> pila ){
            if(pila.isEmpty()){
                System.out.println();
                System.out.println("No hay cambios realizados");
                return null;
            }
            ObjCambioTexto cambioDeshecho = pila.pop();
            System.out.println("¡Registro eliminado exitosamente!");
            return cambioDeshecho;
        }

        public ObjCambioTexto ConsultarUltimoCambio(Stack<ObjCambioTexto> pila){
            if(pila.isEmpty()){
                System.out.println();
                System.out.println("No hay cambios realizados");
                return null;
            }
            return pila.peek();
        }

        public void MostrarHistorial(Stack<ObjCambioTexto> pila){
            if(pila.isEmpty()){
                System.out.println();
                System.out.println("No hay cambios realizados");
                return;
            }
            System.out.println("Historial de cambios:");
            for(int i = pila.size() - 1; i >= 0; i--){
                ObjCambioTexto cambio = pila.get(i);
                System.out.println("Usuario: " + cambio.getUsuario());
                System.out.println("Texto anterior: " + cambio.getTextoAnterior());
                System.out.println("Texto nuevo: " + cambio.getTextoNuevo());
                System.out.println("Fecha: " + cambio.getFecha());
                System.out.println("-----");
            }
        }
        
        public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("¡Por favor ingresar dato numérico entero!");
            sc.next();
        }
        return sc.nextInt();
    }

    }
