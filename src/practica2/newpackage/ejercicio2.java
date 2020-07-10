package practica2.newpackage;




import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("digite el precio de la del vehiculo");
        double valor_usa = leer.nextDouble();
        System.out.println("digite el valor del flete");
        double flete = leer.nextDouble();
            System.out.println("digite el valor del seguro");
        double seguro = leer.nextDouble();
        
        double total =ejercicio2.obtenerDAI(valor_usa, flete, seguro);
        
         System.out.println("total de dai:" + total  );
         
    
}
     public static double obtenerDAI(double valordeusa,double flete, double seguro){
         
         double DAI = 0; 
         double depreciacion = valordeusa *0.10;
         DAI = (valordeusa - depreciacion -  flete-seguro) * 0.25  ;
        
         return DAI;     
    }

    
     

}
