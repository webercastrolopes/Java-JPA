package aplicacao;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Programa {

	public static void main(String[] args) {
	
		// uma vez que ja tenha instanciado estes objetos abaixo no base da dados, posso comenta-los.
		/*
		  	Pessoa p1 = new Pessoa(null,"Carlos da Silva","csilva@gmail.com");
		 	Pessoa p2 = new Pessoa(null,"Joaquim Torres","jtorres@gmail.com");
			Pessoa p3 = new Pessoa(null,"Ana Mariar","amaria@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();	// toda gravação deve estar dentro de uma transação.
			//em.persist(p1);  			//é o 'persist' que pega o objeto e salva no banco de dados.
			   				   			//insert sempre deixar dentro de uma transação
			//em.persist(p2);  			//uma vez ja inseridos no banco posso comenta-los.
			//em.persist(p3);  			//este tb já esta no banco.
		em.getTransaction().commit();
		
			// abaixo vamos buscar um registro no banco pelo Id=2
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
	
	
	
		
		System.out.println("Pronto, feito ...no DB ");
		em.clear();
		emf.close();
		
		/*
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		 */
	}

}
