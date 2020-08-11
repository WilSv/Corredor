/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corredor;

/**
 *
 * @author Karasu
 */
public class Corredor {
     public int energia=30;
   
    public void VerificarEnergia(){
        if(energia >= 0 && energia <= 100){
            System.out.println("La energia actual es " + energia);
        }else{
            energia=0;
            
            System.out.println("La energia actual es " + energia);
            
        }
    }
    
    public void RecargarEnergia(){
        if(energia <=100){
            energia++;
        }else{
            energia=100;
            System.out.println("La energia maxima es " + energia);
        }
            
    }
    public void Correr(){
            energia= energia-10;
    }
    
    public void EnergiaAgotada(){
        if( energia < 10){
            energia=0;
            System.out.println("Se llego al minimo de energia que es 0 " + energia  );
        }else{
            System.out.println("Su energia actual es de " + energia);
        }
        
    }
    
    public void Entrenar(){
        if(energia <= 100){
           energia= energia + 15; 
        }
        
        
    }
    
    public static void main(String[] args) {
        Corredor c = new Corredor();
        System.out.println("Energia inciial: " + c.energia);
        c.Entrenar();
        System.out.println("Energia al entrenar es de : " + c.energia);
        c.Correr();
        c.Correr();
        c.Correr();
        System.out.println("Energia despues de correr 3 veces es de : " + c.energia);
        c.EnergiaAgotada();
        c.Correr();
        c.Correr();
        c.EnergiaAgotada();
        c.RecargarEnergia();
        System.out.println("Energia despues de recargar 1 vez energia es de : " + c.energia);
        c.Entrenar();
        c.Entrenar();
        c.VerificarEnergia();
        
    }
    
    
}
