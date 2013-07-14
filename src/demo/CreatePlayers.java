/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class CreatePlayers {
    
    public static void main(String[] args){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestingCRUDPU");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Player p1 = new Player();
    p1.setId(6);
    p1.setFirstname("Ramesh");
    p1.setLastname("Sivaraman");
    
    p1.setJerseynumber(777);
    p1.setLastspokenwords("Nothing is impossible for me..");
    em.persist(p1);
    
    em.getTransaction().commit();
    em.close();
    emf.close();
    }
    
}
