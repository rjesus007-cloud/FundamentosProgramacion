package rcg.semana10;
import java.util.Scanner;
public class Semana10 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       // Declarar y crear el arreglo
       int[] notas = new int[5];
       
       System.out.println("Ingreso de Notas ");
       for(int i=0;i<notas.length;i++){
           System.out.println("Ingrese nota "+(i+1)+" : ");
           notas[i]=leer.nextInt();
       }
       //Mostrar el arreglo y sumar
       int suma=0;
        System.out.println("Arreglo mostrado");
       for(int i=0;i<notas.length;i++){
           System.out.print(notas[i]+" - ");
       }              
       for(int i=0;i<notas.length;i++){
          suma+=notas[i];
       }
       double prom=suma/notas.length;       
       //mostrar
        System.out.println("");
        System.out.println("Suma total "+suma);
        System.out.println("Promedio "+prom);        
       leer.close();
    }
}
