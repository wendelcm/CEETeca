/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Aluno
 */
@Entity
public class Pessoa {

    @Id
    private int codigoPessoa;
    private String nomePessoa;
    private String dtnascimento;
    private String cpfPessoa;
    private String tipo; //passar para CHAR

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

}
