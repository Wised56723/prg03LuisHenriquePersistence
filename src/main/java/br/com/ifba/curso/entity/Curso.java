/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;



/**
 *
 * @author luis2
 */
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class Curso extends PersistenceEntity implements Serializable {

    @Column (name= "nome", nullable = false)
    private String nome;

    @Column (name= "codigo_curso", nullable = false)
    private String codigo;

    @Column (name= "carga_horaria", nullable = false)
    private int cargaHoraria;

    @Column (name= "ativo")
    private boolean ativo;
    
    @Column (name= "vagas")
    private int vagas;

    public Curso() {
    }


    public Curso(String nome, String codigo, int cargaHoraria, boolean ativo, int vagas) {
        super();
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.ativo = ativo;
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }



 
}