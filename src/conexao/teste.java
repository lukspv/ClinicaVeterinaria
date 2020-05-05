/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class teste {
    
    public static void main(String[] args) {
        
       int resposta;
        
       resposta = JOptionPane.showConfirmDialog( null,"Cadastro existente para para o CPF informado\n Deseja prosseguir?", "Aviso",JOptionPane.YES_NO_OPTION); 
       
        System.out.println("Resposta: "+resposta);
    }

 
    
}
