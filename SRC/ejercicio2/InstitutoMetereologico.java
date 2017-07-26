
package ejercicio2;

import java.util.Scanner;

public class InstitutoMetereologico 
{
    private int numLluvias;
    int i;
    private int cantidadLluvia;
    private String[] nomProvincias=new String[12];
    private int[] sumatoria=new int[12];
    private Scanner leer= new Scanner(System.in);

    public InstitutoMetereologico() 
    {
        numLluvias=0;
        i=0;
    }
    
     void ingresar()
    {
        char tecla;
    
        do{
            System.out.println("Ingrese el nombre de la provincia: ");
            getNomProvincias()[i]=leer.nextLine().toUpperCase();
            System.out.println("Ingrese el numero de Lluvias:");
            setNumLluvias(leer.nextInt());
            for(int j=1;j<=getNumLluvias();j++)
            {
                System.out.println("Ingrese la cantidad de lluvia #"+j+" : ");
                setCantidadLluvia(leer.nextInt());
                getSumatoria()[i]=getSumatoria()[i]+getCantidadLluvia();
            }
            System.out.println("desea ingresar otra provincia? s/n ");
            tecla=leer.next().charAt(0);
            i++;
        }while(tecla=='s');
       
        
    }
    
    public void imprimir()
    {
        for(int j=0;j<i;j++)
        {
            System.out.println(getNomProvincias()[j]+" "+getSumatoria()[j]);
        }
        
        
    }

    public int getNumLluvias() {
        return numLluvias;
    }

    public void setNumLluvias(int numLluvias) {
        this.numLluvias = numLluvias;
    }

   
    public int getCantidadLluvia() {
        return cantidadLluvia;
    }

    public void setCantidadLluvia(int cantidadLluvia) {
        this.cantidadLluvia = cantidadLluvia;
    }

    public String[] getNomProvincias() {
        return nomProvincias;
    }

    public void setNomProvincias(String[] a) {
        setNomProvincias(a);
        
    }

    public int[] getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int[] sumatoria) {
        this.setSumatoria(sumatoria);
    }

   

    
    
}
