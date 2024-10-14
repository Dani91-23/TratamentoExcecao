/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotratamentoexcecao;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniele Schneider
 */
public class DiminuiLetras {
    
    public static void lowCase() throws NullPointerException {
        
        String word = null;
        String newWord = null;
        
        word = JOptionPane.showInputDialog(null, "Digite um nome");
        
        if (word != null) {
            newWord = word.toLowerCase();
            System.out.println("A palavra informada é: " + word);
            System.out.println("A palavra corrigida é: " + newWord);
        } else {
            throw new NullPointerException("Nenhuma palavra foi informada.");
        }
    }
}
