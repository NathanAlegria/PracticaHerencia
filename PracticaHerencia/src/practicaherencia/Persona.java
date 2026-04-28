/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author Nathan
 */
public class Persona {

    protected String nombre;
    protected int edad;
    protected String documentoIdentidad;
    protected String direccion;
    protected String numeroContacto;

    public Persona(String nombre, int edad, String documentoIdentidad,String direccion, String numeroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.documentoIdentidad = documentoIdentidad;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Doc: " + documentoIdentidad + " | Direccion: " + direccion + " | Contacto: " + numeroContacto;
    }
}
