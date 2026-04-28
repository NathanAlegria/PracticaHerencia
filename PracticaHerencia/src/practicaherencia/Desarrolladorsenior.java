/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author Nathan
 */
public class Desarrolladorsenior extends Desarrollador implements Evaluador, Capacitador {

    private int aniosExperiencia;
    private int proyectosLiderados;
    private String nivelEspecializacion;
    private boolean capacidadMentoria;

    public Desarrolladorsenior(String nombre, int edad, String documentoIdentidad, String direccion, String numeroContacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String areaSede, String lenguajePrincipal, String nivelDominio, String herramientas, int cantidadProyectos, int aniosExperiencia, int proyectosLiderados, String nivelEspecializacion, boolean capacidadMentoria) {
        super(nombre, edad, documentoIdentidad, direccion, numeroContacto, salario, idEmpleado, fechaContratacion, tipoContrato, areaSede, lenguajePrincipal, nivelDominio, herramientas, cantidadProyectos);
        this.aniosExperiencia = aniosExperiencia;
        this.proyectosLiderados = proyectosLiderados;
        this.nivelEspecializacion = nivelEspecializacion;
        this.capacidadMentoria = capacidadMentoria;
    }

    @Override
    public void trabajar() {
        System.out.println("[Dev Senior] " + nombre + " esta liderando el equipo, revisando arquitectura y escribiendo codigo en " + getLenguajePrincipal() + ".");
    }

    @Override
    public void evaluarDesempeno(String nombreEmpleado) {
        System.out.println("[Evaluador Senior] " + nombre + " realiza una evaluacion tecnica detallada de " + nombreEmpleado + ".");
    }

    @Override
    public void impartirCapacitacion(String tema) {
        System.out.println("[Capacitador] " + nombre + " imparte una capacitación sobre: \"" + tema + "\".");
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public int getProyectosLiderados() {
        return proyectosLiderados;
    }

    @Override
    public String toString() {
        return super.toString() + " | Experiencia: " + aniosExperiencia + " años" + " | Proyectos liderados: " + proyectosLiderados + " | Especialización: " + nivelEspecializacion + " | Mentoría: " + (capacidadMentoria ? "Sí" : "No");
    }
}
