/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

import java.util.Scanner;

/**
 *
 * @author clayton
 */
public class Menu {
    
    public int op;
    Cliente cliente = new Cliente();
    
    public void selecao(){
        
        this.op=2;
        
        switch(op){
            case 1: {
                
                cliente.cadastrar();
            }
            
            case 2: {
                cliente.exibir();
            }
            
            // Exemplo de uso errado de responsabilidade da classe
//            case 1: {
//                
//                String nome;
//                System.out.println("Informe o seu nome: ");
//                Scanner in = new Scanner(System.in);
//                nome=in.nextLine();
//                System.out.println(nome);
//                
//            }
        }
           
    }
    
}
