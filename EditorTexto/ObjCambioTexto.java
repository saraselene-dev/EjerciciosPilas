package EditorTexto;

import java.time.LocalDateTime;

public class ObjCambioTexto {
    private String Usuario;
    private String TextoAnterior;
    private String TextoNuevo;
    private LocalDateTime Fecha;

    public ObjCambioTexto(String usuario, String textoAnterior, String textoNuevo) {
        Usuario = usuario;
        TextoAnterior = textoAnterior;
        TextoNuevo = textoNuevo;
        Fecha = LocalDateTime.now();
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getTextoAnterior() {
        return TextoAnterior;
    }

    public String getTextoNuevo() {
        return TextoNuevo;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public void setTextoAnterior(String textoAnterior) {
        TextoAnterior = textoAnterior;
    }

    public void setTextoNuevo(String textoNuevo) {
        TextoNuevo = textoNuevo;
    }
}
