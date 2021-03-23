
package com.br.dao;

import com.br.utils.Singleton;
import javax.persistence.EntityManager;
import com.br.modelo.Movimentacao;
import java.util.List;
import javax.persistence.Query;

public class MovimentacaoDAO {
    
    private final EntityManager em;
    
    public MovimentacaoDAO(){
        em = Singleton.getConnection();
    }
    
    protected void inserirMovimentacao(Movimentacao cat){
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
        
    }
    
     protected void alterarMovimentacao(Movimentacao cat){
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
    }
    
        protected void excluirMovimentacao(Movimentacao cat){
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();           
        
    }
        
          protected List listarMovimentacao(String cat){
        em.getTransaction().begin();
        Query query = em.createQuery("select e from Movimentacao e where e.valorMovimentacao =:likes");
        query.setParameter("likes","%" + cat.trim() + "&");
        List<Movimentacao> lista = query.getResultList();        
        em.getTransaction().commit();
        return lista;
        
    }  
        
}

    

