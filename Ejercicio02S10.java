/*
 Mostrar los elementos de un arreglo en forma inversa
1 5 11 20 7 2
2 7 20 11 5 1
 */
package S10;
public class Ejercicio02S10 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println("Arreglo invertido");
        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+ "  ");
        }
    }    
}
