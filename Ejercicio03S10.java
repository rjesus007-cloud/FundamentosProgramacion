/*
Almacenar temperaturas de 10 días y mostrar:
• Temperatura máxima
• Temperatura mínima
• Promedio
 */
package S10;

public class Ejercicio03S10 {
    public static void main(String[] args) {
        double[] temp = {20.1,32.3,27.4,22.5,27.0,
                         25.0,19.4,15.5,23.3,24.9};
        double max = temp[0];
        double min = temp[0];
        double prom,sum=0;
        System.out.println("Temperaturas son");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" - ");
            sum+=temp[i];// sumando y acumulando cada temperatura
        }
        // Calculo temperatura max y min
        for(int i=1;i<temp.length;i++){
            if(temp[i]>max){
                max=temp[i];
            }
            if(temp[i]<min){
                min=temp[i];
            }
        }
        prom=sum/temp.length;
        //mostrar
        System.out.println("Temperatura MAxima"+max);
        System.out.println("Tempratura Minima "+min);
        System.out.println("Promedio "+ prom);
    }
}
