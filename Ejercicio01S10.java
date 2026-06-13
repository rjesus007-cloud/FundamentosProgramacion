/*
Leer 7 calificaciones y determinar
cuántas son aprobadas (>= 11).
*/
package S10;
import java.util.Scanner;
public class Ejercicio01S10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] notas = new int[7];
        int aprob=0;
        
        for(int i=0;i<notas.length;i++){
            System.out.println("Nota "+(i+1));
            notas[i]=leer.nextInt();
        }
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=11){
                aprob++;
            }
        }
        System.out.println("han Aprobado "+aprob+" Estudiantes");
    }
}
