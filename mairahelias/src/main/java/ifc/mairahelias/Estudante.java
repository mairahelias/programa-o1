
package ifc.mairahelias;

import java.util.Date;


public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    char genero;
    private String matricula;
    private String email;
    private int telefone;
    private int anoIngresso;
    private int semestre;
    private String situacaoAcademica;
    
    public Estudante () {
        this.nome = "Nodody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica para calcular idade
        return idade;
    }
    public String obterMatricula(String anoIngresso ) {
        String matricula = ;
        
        return matricula;
        

    }
    public String getNome (){
        return this.nome;
    }
    public void setNome(String set_nome){
        this.nome = set_nome;
    }
    public String getCPF (){
        return this.cpf;
    }
    public void setCPF(String set_CPF){
        this.cpf = set_CPF;
    }
    public char getGenero (){
        return this.genero;
    }
    public void setGenero (char set_genero){
        this.genero = set_genero;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula (String set_matricula){
        this.matricula = set_matricula;
    }
    public String getEmail (){
        return this.email;
    }
     public void setEmail (String set_email){
         this.email = set_email;
     }
     public int getTelefone (){
        return this.telefone;
    }
     public void setTelefone (int set_telefone){
         this.telefone = set_telefone; 
    }
      public int getSemestre (){
        return this.semestre;
    }
     public void setSemestre (int set_semestre){
         this.semestre = set_semestre; 
    }
     public String getSituacaoAcademica (){
        return this.situacaoAcademica;
    }
      public void setSituacaoAcademica (String set_situacaoAcademica){
         this.situacaoAcademica = set_situacaoAcademica; 
    }
}

