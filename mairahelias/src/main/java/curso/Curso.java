package curso;

import java.util.List;

public abstract class Curso {

    private int codigo;
    private String nome;
    private int ch;
    private int duracao;
    private String tipoDeDuracao;
    private String modalidade;
    private boolean status;

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int _codigo) {
        this.codigo = _codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    
    public int getCH() {
        return this.ch;
    }
    public void setCH(int _ch) {
        this.ch = _ch;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    public void setDuracao(int _duracao) {
        this.duracao = _duracao;
    }
    
    public String getTipoDeDuracao() {
        return this.tipoDeDuracao;
    }
    public void setTipoDeDuracao(String _tipoDeDuracao) {
        this.tipoDeDuracao = _tipoDeDuracao;
    }
     public String getModalidade() {
        return this.modalidade;
    }
    public void setModalidade(String _modalidade) {
        this.modalidade = _modalidade;
    }
   
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean _status) {
        this.status = _status;
    }
    
    public List<String> obterDisciplina(){
        //return disciplina
    }
    
    public List<String> obterAlunosAtivos(){
        //return alunos ativos
    }
    public List<String> obterAlunosEgressos(){
        
    }
    public abstract void realizarMatricula
} 
