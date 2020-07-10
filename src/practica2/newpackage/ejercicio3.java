package practica2.newpackage;



   
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("nombre de vendedor:");
        String nombre = leer.nextLine();
        System.out.println("cantidad de autos vendidos:");
        int cantidadAuto = leer.nextInt();
        System.out.println("ingrese el sueldo");
        double sueldo = leer.nextDouble();
        
       double total_salario = ejercicio3.salario(cantidadAuto, sueldo);
           System.out.println("nombre del vendedor :" + nombre);
        System.out.println("salario devengado al mes: " + total_salario);
    }
    
    public static double salario (int cantidadAuto, double sueldo){
      
       double comision = 170;
       double porcentaje = 0.05;
   
       double total1 = comision * cantidadAuto;
       double total2 = total1 * porcentaje;
       double total3 = total1 + total2;
       double total4 = sueldo + total3;
       
        return total4;
        
        
    }
    
    
    }
    

