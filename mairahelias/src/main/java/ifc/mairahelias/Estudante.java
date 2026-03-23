package ifc.mairahelias;

import java.util.Date;

public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    char genero;
    private String email;
    private int anoIngresso;
    private int telefone;
    private String situacaoAcademica;
    private int semestre;
    private int codigo;

    public Estudante() {
        this.nome = "Nodody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica para calcular idade
        return idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String _CPF) {
        this.cpf = _CPF;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char _genero) {
        this.genero = _genero;
    }

    public String getCodigo() {
        String matricula;
        return matricula = String.valueOf(anoIngresso) + String.valueOf(semestre) + codigo;
    }

    public void setMatricula(int _matricula) {
        
        this.codigo = _matricula;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public int getAnoIngresso() {
          return this.anoIngresso;
    }
    public void setAnoIngresso(int _anoIngresso) {
        this.anoIngresso = _anoIngresso;
    }
    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int _telefone) {
        this.telefone = _telefone;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int _semestre) {
        this.semestre = _semestre;
    }

    public String getSituacaoAcademica() {
        return this.situacaoAcademica;
    }

    public void setSituacaoAcademica(String _situacaoAcademica) {
        this.situacaoAcademica = _situacaoAcademica;
    }
}
