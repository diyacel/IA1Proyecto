
package ejercicio1;

import java.util.Scanner;

public class Restaurante {
    //atributos
    float papas;
    float chochos;
    //constructor
    Restaurante(float papas, float chochos) {
        this.papas = papas;
        this.chochos = chochos;
    }
    //metodos
    public void ingresar()
    {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el monto de papas en kilos");
        papas=leer.nextFloat();
        System.out.println("Ingrese el monto de chochos en kilos");
        chochos=leer.nextFloat(); 
    }
    public void calcular()
    {
        int contador=0;
        float a=(float) (0.3),b=(float)(0.16);
       
        
        if(papas>=a && chochos>=b)
        {
            System.out.println(b+" "+a);
            while(papas>=a&&chochos>=b)
            {
                papas=(float)(papas-a);
                chochos=(float) (chochos-b);
                contador++;
            }  
            System.out.println("El numero de personas que ingresaron son: "+contador);
        }else{
            System.out.println("no existe en estok");
        }
    }
}
