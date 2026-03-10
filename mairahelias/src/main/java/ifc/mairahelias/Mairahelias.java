/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifc.mairahelias;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Mairahelias {

    public static void main(String[] args) {
        Estudante mairah = new Estudante();
        Estudante vinicius = new Estudante();
        Estudante anthony = new Estudante();
        
        mairah.setNome("mairah");
        vinicius.setNome("vinicius");
        anthony.setNome("anthony");
                
        System.out.println(mairah.getNome());
        System.out.println(vinicius.getNome());
        System.out.println(anthony.getNome());
    }
}
