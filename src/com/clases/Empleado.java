package com.clases;
import com.clases.Persona;

/**
 *
 * @author Admin
 */
public class Empleado extends Persona{
    
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String departamento;
    private String cargo;
    private double salario;
    private int fechaIngreso;
    private String intereses;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, String genero, String departamento, String cargo, double salario, int fechaIngreso, String intereses, String dui, String nit) {
        super(dui, nit);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getIntereses() {
        return intereses;
    }
    
    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
       
}
