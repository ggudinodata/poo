/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4poo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Empleado {
    private static int totalEmpleados = 0;
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    public Empleado(int id, String nombre, String puesto, double salario){
        Empleado.totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    public Empleado(String nombre, String puesto ){
        Empleado.totalEmpleados++;
        this.id = Empleado.totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1500.00;
    }
    @Override
    public String toString(){
        return "Id: "+ this.id + "Nombre: " + this.nombre + "Puesto: " +
                this.puesto + "Salario: " + this.salario;
    }
    
    public static int mostrarTotalEmpleados(){
        return Empleado.totalEmpleados;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    
}
