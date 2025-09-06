/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4poo;

/**
 *
 * @author gmgud_ita4nrw
 */
public class Tp4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Empleado e1 = new Empleado("Luis", "QA");
    Empleado e2 = new Empleado("Gabriel", "Data Engineer");
    Empleado e3 = new Empleado(100, "Ana", "Dev Sr", 5000.0);

    e1.actualizarSalario(5200.0);

    e2.actualizarSalario(10);

    
    System.out.println(e1.toString());
    System.out.println(e2.toString());
    System.out.println(e3.toString());

    System.out.println("Total empleados creados: " + Empleado.mostrarTotalEmpleados());
}

}
