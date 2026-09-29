package com.mycompany.exercicio_for_2;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de vezes: "));
        String frase = JOptionPane.showInputDialog("digite a frase");
        for(int i=1; i <= n ;i++){
            JOptionPane.showMessageDialog(null,frase + " as feses foram: " + i);
        }
    }
}
