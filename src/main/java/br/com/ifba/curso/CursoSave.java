/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso;

/**
 *
 * @author luis2
 */



import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CursoSave {

         private final static EntityManagerFactory entityManagerFactory = 
                 Persistence.createEntityManagerFactory("prg03persistencia");

         private final static EntityManager entityManager
                 = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {


            Curso curso = new Curso();
            curso.setNome("Analise e Desenvolvimento de Sistemas");
            curso.setCodigo("ADS");
            curso.setCargaHoraria(2);
            curso.setAtivo(true);
            curso.setVagas(40);

            entityManager.getTransaction().begin();
            entityManager.persist(curso);
            entityManager.getTransaction().commit();

    }

}
