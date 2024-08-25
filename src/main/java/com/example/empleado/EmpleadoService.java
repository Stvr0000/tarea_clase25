
package com.example.empleado;

import java.util.List;

public interface EmpleadoService {
    void registrarEmpleado(Empleado empleado);
    List<Empleado> listarEmpleados();
    void bajarEmpleado(String id);
    double calcularIgss(Empleado empleado);
    double calcularIrtra(Empleado empleado);
    void agregarBono(Empleado empleado, double bono);
    void agregarDescuento(Empleado empleado, double descuento);
}
