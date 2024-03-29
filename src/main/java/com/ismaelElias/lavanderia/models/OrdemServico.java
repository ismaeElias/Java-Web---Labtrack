package com.ismaelElias.lavanderia.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "ORDEM_SERVICOS")
@SequenceGenerator(name = "SEQ_ORDEM_SERVICOS", allocationSize = 10, sequenceName = "SEQ_ORDEM_SERVICOS")
public class OrdemServico implements Entidade {

	@Id
	@Column(name = "ID_ORDEM_SERVICO")
	@GeneratedValue(generator = "SEQ_ORDEM_SERVICOS", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne()
	@JoinColumn(name = "ID_CLIENTE",
			foreignKey =
			@ForeignKey(name = "FK_ORDEM_SERVICO_CLIENTE",
					value = ConstraintMode.CONSTRAINT))
	private Cliente cliente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ENTRADA")
	private Date dataEntrada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_RETIRADA")
	private Date dataRetirada;

	@Column(name = "VL_TOTAL", precision = 15, scale = 5)
	private BigDecimal valorTotal;

	@ManyToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER)
	@JoinTable(name = "ITENS_ORDEM",
			joinColumns = {
					@JoinColumn(name = "ID_ORDEM", referencedColumnName = "ID_ORDEM_SERVICO")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "ID_ITEM", referencedColumnName = "ID_ITEM")
			})
	private List<Item> itens = new ArrayList<>();


	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public List<Item> getItems() {
		return itens;
	}

	public void setItems(List<Item> items) {
		this.itens = itens;
	}
}
