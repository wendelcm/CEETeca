package models;
// Generated 20/11/2018 13:58:57 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso  implements java.io.Serializable {


     private int codigoCurso;
     private String descricaoCurso;
     private char turnoCurso;
     private String moduloCurso;
     private Set professorHasCursos = new HashSet(0);
     private Set turnos = new HashSet(0);

    public Curso() {
    }

	
    public Curso(int codigoCurso, String descricaoCurso, char turnoCurso, String moduloCurso) {
        this.codigoCurso = codigoCurso;
        this.descricaoCurso = descricaoCurso;
        this.turnoCurso = turnoCurso;
        this.moduloCurso = moduloCurso;
    }
    public Curso(int codigoCurso, String descricaoCurso, char turnoCurso, String moduloCurso, Set professorHasCursos, Set turnos) {
       this.codigoCurso = codigoCurso;
       this.descricaoCurso = descricaoCurso;
       this.turnoCurso = turnoCurso;
       this.moduloCurso = moduloCurso;
       this.professorHasCursos = professorHasCursos;
       this.turnos = turnos;
    }
   
    public int getCodigoCurso() {
        return this.codigoCurso;
    }
    
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public String getDescricaoCurso() {
        return this.descricaoCurso;
    }
    
    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }
    public char getTurnoCurso() {
        return this.turnoCurso;
    }
    
    public void setTurnoCurso(char turnoCurso) {
        this.turnoCurso = turnoCurso;
    }
    public String getModuloCurso() {
        return this.moduloCurso;
    }
    
    public void setModuloCurso(String moduloCurso) {
        this.moduloCurso = moduloCurso;
    }
    public Set getProfessorHasCursos() {
        return this.professorHasCursos;
    }
    
    public void setProfessorHasCursos(Set professorHasCursos) {
        this.professorHasCursos = professorHasCursos;
    }
    public Set getTurnos() {
        return this.turnos;
    }
    
    public void setTurnos(Set turnos) {
        this.turnos = turnos;
    }




}


