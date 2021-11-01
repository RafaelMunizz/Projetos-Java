/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_pessoa.Tipos;
import poo_pessoa.Pessoa;

/**
 *
 * @author rafaelmuniz
 */
public class MainTipos {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Fulano", 20, "M");
        Aluno p2 = new Aluno("Estudioso", 15, "M");
        Professor p3 = new Professor("Mestra", 30, "F");        
        Funcionario p4 = new Funcionario("Esforçada", 26, "F");

        p1.setNome("Fulaninho");
        
        p2.setCurso("Informatica");
        p3.setSalario(2000);
        p4.setSetor("Estoque");
        
        //p1.receberAum(); Não possui este método
        
        
    }
    
}
