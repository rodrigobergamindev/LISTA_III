
package src;

import javax.swing.JOptionPane;

/**
 *
 Faça um programa que leia uma string com letras e dígitos e exiba, após a leitura, a quantidade de
dígitos dela.
 */
public class L {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Informe uma string");
        char strArray [] = str.toCharArray();
        
        System.out.println("A quantidade digitos é: " + strArray.length);
        
        
    }
}
