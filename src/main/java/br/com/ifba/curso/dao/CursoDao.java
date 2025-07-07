/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import java.util.List;

/**
 *
 * @author luis2
 */
public class CursoDao extends GenericDao<Curso> implements CursoIDao {
    @Override
    public List<Curso> findByName(String nome) {
        return entityManager.createQuery(
                "SELECT c FROM Curso c WHERE LOWER(c.nome) LIKE :nome", Curso.class)
            .setParameter("nome", "%" + nome.toLowerCase() + "%")
            .getResultList();
    }
}
