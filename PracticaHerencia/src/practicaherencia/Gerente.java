/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author Nathan
 */
public class Gerente extends Empleado implements Evaluador {

    private String departamento;
    private int personalACargo;
    private double presupuesto;
    private String frecuenciaReuniones;

    public Gerente(String nombre, int edad, String documentoIdentidad, String direccion, String numeroContacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String areaSede, String departamento, int personalACargo, double presupuesto, String frecuenciaReuniones) {
        super(nombre, edad, documentoIdentidad, direccion, numeroContacto, salario, idEmpleado, fechaContratacion, tipoContrato, areaSede);
        this.departamento = departamento;
        this.personalACargo = personalACargo;
        this.presupuesto = presupuesto;
        this.frecuenciaReuniones = frecuenciaReuniones;
    }

    @Override
    public void trabajar() {
        System.out.println("[Gerente] " + nombre + " esta coordinando al equipo del departamento " + departamento + ".");
    }

    @Override
    public void evaluarDesempeno(String nombreEmpleado) {
        System.out.println("[Evaluador] " + nombre + " esta evaluando el desempeno de " + nombreEmpleado + ".");
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getPersonalACargo() {
        return personalACargo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Departamento: " + departamento + " | Personal a cargo: " + personalACargo + " | Presupuesto: $" + presupuesto + " | Reuniones: " + frecuenciaReuniones;
    }
}
