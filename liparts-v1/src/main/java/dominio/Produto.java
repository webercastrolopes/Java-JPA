package dominio;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto implements Serializable  {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String codigo;
	
	private String 	codref1;
	private String 	codref2;
	private String 	marca;
	private String nome;
	private Double	preco;
	

	public Produto() {
		
	}


	public Produto(Long id, String codigo, String codref1, String codref2, String marca, String nome, Double preco) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.codref1 = codref1;
		this.codref2 = codref2;
		this.marca = marca;
		this.nome = nome;
		this.preco = preco;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCodref1() {
		return codref1;
	}


	public void setCodref1(String codref1) {
		this.codref1 = codref1;
	}


	public String getCodref2() {
		return codref2;
	}


	public void setCodref2(String codref2) {
		this.codref2 = codref2;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", codigo=" + codigo + ", codref1=" + codref1 + ", codref2=" + codref2 + ", marca="
				+ marca + ", nome=" + nome + ", preco=" + preco + "]";
	}




	
	
	
}
