/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author Nathan
 */
public class Desarrollador extends Empleado {

    private String lenguajePrincipal;
    private String nivelDominio;
    private String herramientas;
    private int cantidadProyectos;

    public Desarrollador(String nombre, int edad, String documentoIdentidad, String direccion, String numeroContacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String areaSede, String lenguajePrincipal, String nivelDominio, String herramientas, int cantidadProyectos) {
        super(nombre, edad, documentoIdentidad, direccion, numeroContacto, salario, idEmpleado, fechaContratacion, tipoContrato, areaSede);
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivelDominio = nivelDominio;
        this.herramientas = herramientas;
        this.cantidadProyectos = cantidadProyectos;
    }

    @Override
    public void trabajar() {
        System.out.println("[Desarrollador] " + nombre + " esta escribiendo codigo en " + lenguajePrincipal + ".");
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public String getNivelDominio() {
        return nivelDominio;
    }

    public int getCantidadProyectos() {
        return cantidadProyectos;
    }

    @Override
    public String toString() {
        return super.toString() + " | Lenguaje: " + lenguajePrincipal + " | Nivel: " + nivelDominio + " | Herramientas: " + herramientas + " | Proyectos: " + cantidadProyectos;
    }
}
