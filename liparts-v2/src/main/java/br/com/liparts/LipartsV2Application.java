package br.com.liparts;

import dominio.Cotacao;
import dominio.Fornecedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LipartsV2Application {

	//public static void main(String[] args) {
	//	SpringApplication.run(LipartsV2Application.class, args);
	//}
	
	
	public static void main(String[] args) {
		
		// uma vez que ja tenha instanciado estes objetos abaixo no base da dados, posso comenta-los.
		
		// Produto prod2 = new Produto("","","fleltguard","Filtro 5700043 LUB Liebherr 902 944",121.23, null,"5700043");
		
		Fornecedor forn = new Fornecedor(null,"DAPEC");
		
		Cotacao cota1 = new Cotacao("2","2","","",1,117.59);
		// verificar problema para gravar campo 'enum'
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("liparts-jpa");
		EntityManager em = emf.createEntityManager();

		  em.getTransaction().begin();
		  em.persist(cota1);
		  em.getTransaction().commit();
		  
		  em.getTransaction().begin();
		  em.persist(forn);
		  em.getTransaction().commit();
		  
				  
		//em.getTransaction().begin();	// toda gravação deve estar dentro de uma transação.
		//em.persist(prod2);
										//é o 'persist' que pega o objeto e salva no banco de dados.
			   				   			//insert sempre deixar dentro de uma transação
										//uma vez ja inseridos no banco posso comenta-los.
										//este tb já esta no banco.
		
		//em.getTransaction().commit();
		
		// abaixo vamos buscar um registro no banco pelo Id=2 (PK)
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		
		System.out.println("Perfeito, carga feito no .... Liparts-v2 DB");
		System.out.println(forn);
		System.out.println(cota1);
		
		em.close();
		emf.close();
		
		
	
		
		/*
		System.out.println(p1);
		System.out.println(p3);
		System.out.println(p4);
		 */
	}


}
