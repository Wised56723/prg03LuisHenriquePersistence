/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

/**
 *
 * @author luis2
 */

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.util.StringUtil;
import java.util.List;

/**
 * Camada de serviço responsável pelas regras de negócio relacionadas à entidade Curso.
 */
public class CursoService implements CursoIService {

    private final CursoIDao cursoDao = new CursoDao();

    /**
     * Salva um novo curso após aplicar as validações de negócio.
     */
    @Override
    public Curso saveCurso(Curso curso) {
        validarCurso(curso);
        return cursoDao.save(curso);
    }

    /**
     * Atualiza um curso existente após aplicar as validações de negócio.
     */
    @Override
    public Curso updateCurso(Curso curso) {
        validarCurso(curso);
        return cursoDao.update(curso);
    }

    /**
     * Remove um curso existente.
     */
    @Override
    public void deleteCurso(Curso curso) {
        if (curso == null || curso.getId() == null) {
            throw new RuntimeException("Curso inválido para remoção.");
        }
        cursoDao.delete(curso);
    }

    /**
     * Retorna todos os cursos cadastrados.
     */
    @Override
    public List<Curso> getAllCursos() {
        return cursoDao.findAll();
    }

    /**
     * Busca um curso pelo ID.
     */
    @Override
    public Curso findCursoById(Long id) {
        if (id == null) {
            throw new RuntimeException("ID não pode ser nulo.");
        }
        return cursoDao.findById(id);
    }

    /**
     * Busca cursos com nomes contendo o texto informado.
     */
    @Override
    public List<Curso> findByName(String nome) {
        if (StringUtil.isNullOrEmpty(nome)) {
            throw new RuntimeException("Nome de busca não pode ser vazio.");
        }
        return cursoDao.findByName(nome.toLowerCase());
    }

    /**
     * Aplica validações antes de salvar ou atualizar o curso.
     */
    private void validarCurso(Curso curso) {
        if (curso == null) {
            throw new RuntimeException("Curso não pode ser nulo.");
        }
        if (StringUtil.isNullOrEmpty(curso.getNome())) {
            throw new RuntimeException("Nome do curso é obrigatório.");
        }
        if (StringUtil.isNullOrEmpty(curso.getCodigo())) {
            throw new RuntimeException("Código do curso é obrigatório.");
        }
        if (curso.getCargaHoraria() <= 0) {
            throw new RuntimeException("Carga horária deve ser maior que zero.");
        }
        if (curso.getVagas() < 0) {
            throw new RuntimeException("Número de vagas não pode ser negativo.");
        }
    }
}


