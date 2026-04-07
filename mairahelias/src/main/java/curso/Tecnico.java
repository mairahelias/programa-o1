/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author aluno
 */
public class Tecnico extends Curso {
    private String eixoTecnologico;
    private int chEstagio;
    
    public String getEixoTecnologico() {
        return this.eixoTecnologico;
    }
    public void setEixoTecnologico(String _eixoTecnologico) {
        this.eixoTecnologico = _eixoTecnologico;
    }
    
     public int getCHestagio() {
        return this.chEstagio;
    }
    public void setCHestagio(int _chEstagio) {
        this.chEstagio = _chEstagio;
    }
   
    public void realizarMatricula(){
        //realizar matricula
    }
    
}
