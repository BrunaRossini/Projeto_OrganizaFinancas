
package com.br.dao;

import com.br.utils.Singleton;
import javax.persistence.EntityManager;
import com.br.modelo.Categoria;
import java.util.List;
import javax.persistence.Query;

public class CategoriaDAO {
    
    private final EntityManager em;
    
    public CategoriaDAO(){
        em = Singleton.getConnection();
    }
    
    public void inserirCategoria(Categoria cat){
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
        
    }
    
     public void alterarCategoria(Categoria cat){
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
    }
    
        public void excluirCategoria(Categoria cat){
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();           
        
    }
        
          public List listarCategoria(String cat){
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT c FROM Categoria c WHERE c.descricao LIKE :likes");
        query.setParameter("likes","%" + cat.trim() + "%");
        List<Categoria> lista = query.getResultList();        
        em.getTransaction().commit();
        return lista;
        
    }  
        
}
