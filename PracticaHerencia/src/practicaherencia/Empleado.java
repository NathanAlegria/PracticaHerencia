/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author Nathan
 */
public class Empleado extends Persona {

    protected double salario;
    protected String idEmpleado;
    protected String fechaContratacion;
    protected String tipoContrato;
    protected String areaSede;

    public Empleado(String nombre, int edad, String documentoIdentidad, String direccion, String numeroContacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String areaSede) {
        super(nombre, edad, documentoIdentidad, direccion, numeroContacto);
        this.salario = salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato = tipoContrato;
        this.areaSede = areaSede;
    }

    public void trabajar() {
        System.out.println("[Empleado] " + nombre + " esta realizando sus labores generales.");
    }

    public double getSalario() {
        return salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + " | ID: " + idEmpleado + " | Salario: $" + salario + " | Contrato: " + tipoContrato + " | Area: " + areaSede + " | Ingreso: " + fechaContratacion;
    }
}
