package practica2.newpackage;




import java.util.Scanner;


public class ejecicio4 {
    public static void main(String[] args) {
        
    
     Scanner leer = new Scanner(System.in);
        
        System.out.println("nombre de vendedor:");
        String nombre = leer.nextLine();
        System.out.println("cantidad de computadoras vendidos:");
        int cantidadComputadora = leer.nextInt();
        System.out.println("ingrese el sueldo");
        double sueldo = leer.nextDouble();
        
       double total_salario = ejecicio4.salario(cantidadComputadora, sueldo);
           System.out.println("nombre del vendedor :" + nombre);
        System.out.println("salario devengado al mes: " + total_salario);
    }
    
    public static double salario (int cantidadComputadora, double sueldo){
      
       double comision = 50;
       double renta = 0.10;
       
      double comision_por_venta = comision * cantidadComputadora;
      double sueldo_con_comision = comision_por_venta + sueldo;
      double total_renta = sueldo_con_comision * renta;
      double total_devengado = sueldo_con_comision - total_renta;
      
       
    
       
       
        return total_devengado;
}
}   