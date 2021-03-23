package com.br.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {
    
    private static EntityManager connection;
    private static EntityManagerFactory emf;

    /**
     * @return the connection
     */
    public static EntityManager getConnection() {
        if(connection==null){
            setConnection();
        }
        return connection;
    }

    /**
     * @param aConnection the connection to set
     */
    public static void setConnection() {
        emf = Persistence.createEntityManagerFactory("JPA");
        connection = emf.createEntityManager();
                
    }
    
    
}
