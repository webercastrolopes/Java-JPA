package dominio;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cotacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cotacaoNr;
	
	private String 			cod_for;
	private String 			cod_prd;
	private String 			marca;
	private String			pedido;
	private Integer			quantidade;
	
	// @Enumerated(EnumType.STRING)
	// private cotaStatus		status;
	
	private Double 			vl_orcado;
	
	
	public Cotacao() {
		
	}


	public Cotacao( String cod_for, String cod_prd, String marca, String pedido, Integer quantidade,
			 Double vl_orcado) {
		
	
		this.cod_for = cod_for;
		this.cod_prd = cod_prd;
		this.marca = marca;
		this.pedido = pedido;
		this.quantidade = quantidade;
	
		this.vl_orcado = vl_orcado;
	}


	



	@Override
	public String toString() {
		return "Cotacao [cotacaoNr=" + cotacaoNr + ", cod_for=" + cod_for + ", cod_prd=" + cod_prd + ", marca=" + marca
				+ ", pedido=" + pedido + ", quantidade=" + quantidade + ", vl_orcado="
				+ vl_orcado + "]";
	}




	

}
