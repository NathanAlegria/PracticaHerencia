/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Main {

    static Scanner lea = new Scanner(System.in);
    static List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            System.out.print("Elige una opcion: ");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1:
                    registrarEmpleado();
                    break;
                case 2:
                    mostrarJornadaLaboral();
                    break;
                case 3:
                    mostrarNomina();
                    break;
                case 4:
                    mostrarCapacidades();
                    break;
                case 5:
                    mostrarFichasCompletas();
                    break;
                case 0:
                    System.out.println("\n¡Hasta luego! — TechCorp");
                    break;
                default:
                    System.out.println(" Opcion no valida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    static void mostrarMenuPrincipal() {
        System.out.println("\n**************************************");
        System.out.println("     SISTEMA DE EMPLEADOS   TECHCORP      ");
        System.out.println("**************************************");
        System.out.println("  1. Registrar nuevo empleado");
        System.out.println("  2. Ver jornada laboral");
        System.out.println("  3. Ver nomina de salarios");
        System.out.println("  4. Ver capacidades especiales");
        System.out.println("  5. Ver fichas completas");
        System.out.println("  0. Salir");
        System.out.println("-------------------------------------------");
    }

    static void registrarEmpleado() {
        System.out.println("\n  Tipo de empleado:");
        System.out.println("1. Desarrollador");
        System.out.println("2. Gerente");
        System.out.println("3. Desarrollador Senior");
        System.out.print("Elige tipo: ");
        int tipo = lea.nextInt();
        if (tipo < 1 || tipo > 3) {
            System.out.println(" Tipo no valido.");
            return;
        }

        System.out.println("\n── Datos personales ──────────────────────");
        System.out.print("Nombre completo: ");
        String nombre = lea.next();
        System.out.print("Edad: ");
        int edad = lea.nextInt();
        System.out.print("Documento de identidad: ");
        String doc = lea.next();
        System.out.print("Direccion: ");
        String dir = lea.next();
        System.out.print("Numero de contacto: ");
        String contacto = lea.next();

        System.out.println("\n── Datos laborales ───────────────────────");
        System.out.print("Salario: ");
        double salario = lea.nextDouble();
        System.out.print("ID de empleado: ");
        String idEmp = lea.next();
        System.out.print("Fecha de contratacion: ");
        String fecha = lea.next();
        System.out.println("  Tipo de contrato → 1. Tiempo completo   2. Parcial");
        System.out.print("Elige: ");
        int tc = lea.nextInt();
        String contrato = (tc == 2) ? "Parcial" : "Tiempo completo";
        System.out.print("Area / Sede: ");
        String area = lea.next();

        switch (tipo) {
            case 1:
                System.out.println("\n── Datos del Desarrollador ───────────────");
                System.out.print("Lenguaje principal: ");
                String lenguaje1 = lea.next();
                System.out.print("Nivel (Junior/Mid): ");
                String nivel1 = lea.next();
                System.out.print("Herramientas: ");
                String herram1 = lea.next();
                System.out.print("Cantidad de proyectos: ");
                int proyectos1 = lea.nextInt();
                empleados.add(new Desarrollador(nombre, edad, doc, dir, contacto, salario, idEmp, fecha, contrato, area, lenguaje1, nivel1, herram1, proyectos1));
                System.out.println(" Desarrollador registrado correctamente.");
                break;
            case 2:
                System.out.println("\n── Datos del Gerente ─────────────────────");
                System.out.print("Departamento: ");
                String depto = lea.next();
                System.out.print("Personal a cargo: ");
                int personal = lea.nextInt();
                System.out.print("Presupuesto: ");
                double presu = lea.nextDouble();
                System.out.print("Frecuencia de reuniones: ");
                String reunion = lea.next();
                empleados.add(new Gerente(nombre, edad, doc, dir, contacto, salario, idEmp, fecha, contrato, area, depto, personal, presu, reunion));
                System.out.println(" Gerente registrado correctamente.");
                break;
            case 3:
                System.out.println("\n── Datos del Desarrollador (base) ────────");
                System.out.print("Lenguaje principal: ");
                String lenguaje3 = lea.next();
                System.out.print("Nivel (Senior): ");
                String nivel3 = lea.next();
                System.out.print("Herramientas: ");
                String herram3 = lea.next();
                System.out.print("Cantidad de proyectos: ");
                int proyectos3 = lea.nextInt();
                System.out.println("\n── Datos adicionales Senior ──────────────");
                System.out.print("Años de experiencia: ");
                int anios = lea.nextInt();
                System.out.print("Proyectos liderados: ");
                int liderados = lea.nextInt();
                System.out.print("Especializacion: ");
                String espec = lea.next();
                System.out.print("¿Tiene capacidad de mentoria? (s/n): ");
                boolean mentoria = lea.next().equalsIgnoreCase("s");
                empleados.add(new Desarrolladorsenior(nombre, edad, doc, dir, contacto, salario, idEmp, fecha, contrato, area, lenguaje3, nivel3, herram3, proyectos3, anios, liderados, espec, mentoria));
                System.out.println(" Desarrollador Senior registrado correctamente.");
                break;
        }
    }

    static void mostrarJornadaLaboral() {
        if (empleados.isEmpty()) {
            sinEmpleados();
            return;
        }
        System.out.println("\n**************************************");
        System.out.println("   JORNADA LABORAL — polimorfismo trabajar()");
        System.out.println("**************************************");
        for (Empleado e : empleados) {
            e.trabajar();
        }
    }

    static void mostrarNomina() {
        if (empleados.isEmpty()) {
            sinEmpleados();
            return;
        }
        System.out.println("\n**************************************");
        System.out.println("   NOMINA DE EMPLEADOS");
        System.out.println("**************************************");
        for (Empleado e : empleados) {
            System.out.printf("  %-25s → Salario: $%.2f%n", e.getNombre(), e.getSalario());
        }
    }

    static void mostrarCapacidades() {
        if (empleados.isEmpty()) {
            sinEmpleados();
            return;
        }
        System.out.println("\n**************************************");
        System.out.println("   CAPACIDADES ESPECIALES ");
        System.out.println("**************************************");
        boolean hayAlguno = false;
        for (Empleado e : empleados) {
            if (e instanceof Evaluador ev) {
                System.out.println("  ✔ " + e.getNombre() + " [" + e.getClass().getSimpleName() + "] puede EVALUAR desempeño.");
                ev.evaluarDesempeno("(demostracion)");
                hayAlguno = true;
            }
            if (e instanceof Capacitador cap) {
                System.out.println("  ✔ " + e.getNombre() + " [" + e.getClass().getSimpleName() + "] puede CAPACITAR.");
                cap.impartirCapacitacion("(demostracion)");
                hayAlguno = true;
            }
        }
        if (!hayAlguno) {
            System.out.println("  Ningun empleado tiene capacidades especiales aun.");
        }
    }

    static void mostrarFichasCompletas() {
        if (empleados.isEmpty()) {
            sinEmpleados();
            return;
        }
        System.out.println("\n**************************************");
        System.out.println("   FICHAS COMPLETAS DE EMPLEADOS");
        System.out.println("**************************************");
        for (Empleado e : empleados) {
            System.out.println("\n  ▸ Tipo : " + e.getClass().getSimpleName());
            System.out.println("    " + e);
        }
    }

    static void sinEmpleados() {
        System.out.println("\n No hay empleados registrados todavia. Usa la opcion 1.");
    }
}
