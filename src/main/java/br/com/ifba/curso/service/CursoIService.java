/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.service;

/**
 *
 * @author luis2
 */

import br.com.ifba.curso.entity.Curso;
import java.util.List;

/**
 * Interface que define os serviços disponíveis para a entidade Curso.
 */
public interface CursoIService {
    
    Curso saveCurso(Curso curso);
    
    Curso updateCurso(Curso curso);
    
    void deleteCurso(Curso curso);
    
    List<Curso> getAllCursos();
    
    Curso findCursoById(Long id);
    
    List<Curso> findByName(String nome);
}



