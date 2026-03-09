package ifc.mairahelias;

import java.util.Date;

public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    
    public Estudante () {
        this.nome = "Nodody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica para calcular idade
        return idade;
    }
    public String getNome (){
    return this.nome;
    }
    public void setNome(String set_nome){
    this.nome = set_nome;
    }
 
}