package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Departamento;

public class Main {
	public static void main(String[] args) {
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
	    EntityManager entityManager = factory.createEntityManager();
	    
	    Departamento departamento = new Departamento("Desenvolvimento");
	    entityManager.persist(departamento);
	    
	    factory.close();
	  }
}
