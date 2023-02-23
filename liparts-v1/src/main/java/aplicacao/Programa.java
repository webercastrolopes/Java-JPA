package aplicacao;




import dominio.Cotacao;
import dominio.Fornecedor;
import dominio.Produto;
import dominio.cotaStatus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Programa {

	
	public static void main(String[] args) {
	
		// uma vez que ja tenha instanciado estes objetos abaixo no base da dados, posso comenta-los.
		
		// Produto prod2 = new Produto("","","fleltguard","Filtro 5700043 LUB Liebherr 902 944",121.23, null,"5700043");
		
		Fornecedor forn = new Fornecedor(null,"Cipec NTi");
		
		Cotacao cota1 = new Cotacao("1","10","","",2,97.21);
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
		
		
		System.out.println("Perfeito, carga feito no .... Liparts-v1 DB");
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
