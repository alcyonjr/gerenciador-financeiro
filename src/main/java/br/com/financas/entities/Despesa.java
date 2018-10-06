package br.com.financas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="DESPESA")
@Data
@Builder
@JsonInclude(Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="characters")
public class Despesa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String descricao;	
	
	@OneToOne
	@JoinColumn(name="id_despesa_tipo")
	private DespesaTipo tipo;
	
    @ManyToOne
    @JoinColumn(name="id_conta", insertable = true, updatable = true, nullable = true)
    private Conta conta;
	
}
