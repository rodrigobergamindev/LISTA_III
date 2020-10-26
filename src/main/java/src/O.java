
package src;

/*
Faça um programa que recebe cinquenta números inteiros em um vetor, os ordena e exibe o vetor
ordenado crescente.
*/

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class O {
      public static void main(String args[]) {

        int vet[] = new int [5];

        int aux;

        for(int i = 0; i < vet.length; i++ )
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso: ",null)); 


    for (int i = 0; i < vet.length; i++)
        {
         for(int j = 0; j < (vet.length); j++) {
         if(vet[i] < vet[j]) {

             aux = vet[i];
             vet[i] = vet[j];
             vet[j] = aux;
         }

      }  
   }
    for(int i = 0; i < vet.length; i++) 
        System.out.println(vet[i] + "");


    }
}
