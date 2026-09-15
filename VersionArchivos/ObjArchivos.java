package VersionArchivos;

import java.time.LocalDateTime;

public class ObjArchivos {
    private int Version;
    private String Nombre;
    private LocalDateTime Fecha;
    private  String Descripcion;

    public ObjArchivos(int version, String nombre, String descripcion) {
        Version = version;
        Nombre = nombre;
        Descripcion = descripcion;
        Fecha = LocalDateTime.now();
    }

    public int getVersion() {
        return Version;
    }

    public String getNombre() {
        return Nombre;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    
    
}
