
package com.example.empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        Empleado emp1 = new Empleado("1", "Juan Perez", "Desarrollador", 5000, "2023-01-01", "IT");
        Empleado emp2 = new Empleado("2", "Maria Gomez", "Analista", 4000, "2022-06-15", "IT");

        empleadoService.registrarEmpleado(emp1);
        empleadoService.registrarEmpleado(emp2);

        empleadoService.agregarBono(emp1, 500);
        empleadoService.agregarDescuento(emp2, 200);

        System.out.println("Lista de empleados:");
        for (Empleado emp : empleadoService.listarEmpleados()) {
            System.out.println(emp.getNombre() + " - " + emp.getSalarioBase());
        }

        double igssEmp1 = empleadoService.calcularIgss(emp1);
        double irtraEmp1 = empleadoService.calcularIrtra(emp1);

        System.out.println("IGSS de " + emp1.getNombre() + ": " + igssEmp1);
        System.out.println("IRTRA de " + emp1.getNombre() + ": " + irtraEmp1);
    }
}
