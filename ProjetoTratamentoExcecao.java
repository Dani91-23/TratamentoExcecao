/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetotratamentoexcecao;

public class ProjetoTratamentoExcecao {

    public static void main(String[] args) {
        try {
            DiminuiLetras ltpqn = new DiminuiLetras();
            ltpqn.lowCase();
        } catch (NullPointerException e) {
            System.out.println("Exceção NullPointerException identificada");
            System.out.println("Método lowCase() tratado\n" + e);
        }
    }
}


