/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author clayton
 */
public class Cliente {
    
    private String nome;
    private int id;
    private Date dataNascimento;

    public Cliente(){
        
    }
    
    public void cadastrar(){
        
        System.out.println("Informe o seu nome: ");
        Scanner in = new Scanner(System.in);
        this.nome=in.nextLine();
        System.out.println(nome);
    }
    
    public void exibir() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Id: "+this.id);
        System.out.println("Data: "+this.dataNascimento);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    private int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
       
}
