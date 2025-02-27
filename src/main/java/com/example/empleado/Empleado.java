
package com.example.empleado;

public class Empleado {
    private String id;
    private String nombre;
    private String puestoTrabajo;
    private double salarioBase;
    private String fechaIngreso;
    private String departamento;
    private double igss;
    private double deducciones;
    private double irtra;

    public Empleado(String id, String nombre, String puestoTrabajo, double salarioBase, String fechaIngreso, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getIgss() {
        return igss;
    }

    public void setIgss(double igss) {
        this.igss = igss;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getIrtra() {
        return irtra;
    }

    public void setIrtra(double irtra) {
        this.irtra = irtra;
    }
}
