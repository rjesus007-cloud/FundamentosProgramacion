package rcg.semana12;
import java.util.Scanner;
public class Semana12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] notas ={
                        {10,15,12},
                        {13,12,17},
                        {10,10,19}
                        };
        
        int[][] matriz = new int[2][3];
        //Ingresar datos a la matriz
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese Matriz["+i+"]["+j+"] :");
                matriz[i][j]= leer.nextInt();
            }
        }
        //Mostrar o recorrer matrices notas y matriz
        System.out.println("MAtriz NOTAS");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(notas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriz");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }               
    }
}
