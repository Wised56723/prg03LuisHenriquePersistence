/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

/**
 *
 * @author luis2
 */

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService;
import br.com.ifba.curso.service.CursoService;
import java.util.List;

/**
 * Controller que conecta a View com a camada de Serviço.
 */
public class CursoController implements CursoIController {

    private final CursoIService cursoService = new CursoService();

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return cursoService.updateCurso(curso);
    }

    @Override
    public void deleteCurso(Curso curso) {
        cursoService.deleteCurso(curso);
    }

    @Override
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @Override
    public Curso findCursoById(Long id) {
        return cursoService.findCursoById(id);
    }

    @Override
    public List<Curso> findByName(String nome) {
        return cursoService.findByName(nome);
    }
}

