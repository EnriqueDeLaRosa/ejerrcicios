/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */


public class EjemplosConsola {
    int[] listanum = {20,31,27,2,5,99};
    private int[] maximos(int[] lista){
        int[] listamaximos ={lista[0],lista[0]};
        for(int i=0; i<lista.length; i++){
            if(listamaximos[0]<lista[i]){
                listamaximos[1]= listamaximos[0];
                listamaximos[0]=lista[i];
            }
           
        }   
         /* for(int i=0; i<lista.length; i++){
           if(listamaximos[1] < lista[i] && listamaximos[1] != listamaximos[0]){
                listamaximos[1]=lista[i];
            }
          }*/
          
        return listamaximos;
    }
    
    public static void main(String[] args) {
      EjemplosConsola ejercicios =new EjemplosConsola();
        System.out.println(ejercicios.listanum[2]);
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listanum)));
       
     
    }
    
}
