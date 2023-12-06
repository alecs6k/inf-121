
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Empleado implements Serializable {
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNac;
    private String fechaIng;
    private Double salario;
    
    public Empleado() {
        this.nombre = "nombre 1";
        this.apellido = "apellido 1";
        this.genero = "no definido";
        this.fechaNac = "01/01/2000";
        this.fechaIng = "10/10/2023";
        this.salario = 1000.50;
    }
    public Empleado(String nombre, String apellido, String genero, String fechaNac, String fechaIng, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.fechaIng = fechaIng;
        this.salario = salario;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Genero: " + this.genero);
        System.out.println("Fecha nacimiento: " + this.fechaNac);
        System.out.println("Fecha ingreso: " + this.fechaIng);
        System.out.println("Salario: " + this.salario);
    }
}
