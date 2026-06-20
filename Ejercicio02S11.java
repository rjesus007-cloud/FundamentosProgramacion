/*
INGRESAR 8 NUMEROS EN UN ARREGLO Y SOLICITAR OTRO NUMERO PARA BUSCARLO.
MOSTRAR LA POSICION DONDE SE ENCUENTRA O INDICAR QUE NO EXISTE.
 */
package rcg.semana11;
import java.util.Scanner;
public class Ejercicio02S11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] arreglo = new int[8];
        int buscar;
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese elemento "+(i+1)+" : ");
            arreglo[i]=leer.nextInt();
        }
        //
        System.out.println("Ingrese numero a buscar");
        buscar=leer.nextInt();
        boolean encontrado=false;
        //
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==buscar){
                System.out.println("Numero encontrado : "+i);
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("El numero no Existe");
        }
        
    }
    
}
