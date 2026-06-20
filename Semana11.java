/*
DISEÑAR UN PROGRAMA QUE PERMITA INGRESAR 10 NUMEROS ENTEROS EN UN ARREGLO.
LUEGO DETERMINAR CUANTOS NUMEROS SON PARES Y CUANTOS SON IMPARES
*/
package rcg.semana11;
import java.util.Scanner;
public class Semana11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10]; // declaracion y creacion del arreglo.
        int pares=0;
        int impares=0;
        
        for(int i=0;i<num.length;i++){
            System.out.println("Ingrese numero "+(i+1)+" : ");
            num[i]=leer.nextInt();
            
            if(num[i]%2==0){
                pares++;
            }else{
                impares++;
            }            
        }
        System.out.println("Cantidad PAres : "+pares);
        System.out.println("Cantidad Impares : "+impares);
    }
}
