
package practica2.newpackage;
import java.util.Scanner;

public class ejercicio1 {
    
     public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el precio de la computadora");
        double costo = leer.nextDouble();
        System.out.println("porcentaje de descuento");
        double descuento = leer.nextDouble();
        System.out.println("porcentaje de IVA");
        double IVA = leer.nextDouble();
    
  
        double totaliva = ejercicio1.obteneriva(costo, descuento);
        double totaldescuento = ejercicio1.obtenerdescuento(costo, descuento);
        
        System.out.println("valor del iva:" + totaliva);
        System.out.println("valor del descuento: " + totaldescuento);
        double total = costo - totaliva - totaldescuento;
        System.out.println("total a pagar:" + total);
       
    }
    public static double obtenerdescuento (double costo,double descuento){
        
        double resultadodescuento = 0;
        resultadodescuento = costo * descuento;
        return resultadodescuento;
        
    }
    
    public static double obteneriva (double costo ,double resultadodescuento){
        
        double pagoconiva = 0;
        pagoconiva = costo * 0.13;
        
        return pagoconiva;
        
    
    }
    
   }
    

