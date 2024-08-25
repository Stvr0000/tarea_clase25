
package com.example.empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl implements EmpleadoService {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public void bajarEmpleado(String id) {
        empleados.removeIf(emp -> emp.getId().equals(id));
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        return empleado.getSalarioBase() * 0.0483;
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        return empleado.getSalarioBase() * 0.01;
    }

    @Override
    public void agregarBono(Empleado empleado, double bono) {
        empleado.setSalarioBase(empleado.getSalarioBase() + bono);
    }

    @Override
    public void agregarDescuento(Empleado empleado, double descuento) {
        empleado.setDeducciones(empleado.getDeducciones() + descuento);
    }
}
