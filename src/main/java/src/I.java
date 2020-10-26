
package src;

import javax.swing.JOptionPane;

/**
 Faça um programa que lê uma string sem espaços e a exibe ao contrário.
 */
public class I {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe um nome");
         String nome2 = JOptionPane.showInputDialog("Informe outro nome");
         
         if(nome == nome2) {
             System.out.println("São iguais");
         }else {
             System.out.println("Não são iguais");
         }
    }
}
