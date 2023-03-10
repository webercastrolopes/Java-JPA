package dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer codigo;
		
		private String	nome;

		
		public Fornecedor() {
			
		}
		
		
		public Fornecedor(Integer codigo, String nome) {
			super();
			this.codigo = codigo;
			this.nome = nome;
		}


		public Integer getCodigo() {
			return codigo;
		}


		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		
		@Override
		public String toString() {
			return "Fornecedor [codigo=" + codigo + ", nome=" + nome + "]";
		}
		
		
		
		
		
}
