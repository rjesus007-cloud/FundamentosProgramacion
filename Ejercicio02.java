package rcg.semana10;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num[] = new int[5];        
        System.out.println("Ingreso Datos");
        for(int i=0;i<num.length;i++){
            System.out.println("Ingrese numero "+(i+1)+" : ");
            num[i]=leer.nextInt();
        }
        int mayor=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>mayor){
                mayor=num[i];
            }
        }
        System.out.println("El mayor numero es "+mayor);
    }
}
