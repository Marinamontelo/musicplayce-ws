package br.com.zssn.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.zssn.enums.InventoryPointsEnum;

@Entity
@Table(name = "INVENTORY")
public class Inventory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Enumerated(EnumType.STRING)
	private InventoryPointsEnum desc;

	@Column(name = "quantity", nullable = false)
	private Long quantity;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "survivor_id", referencedColumnName = "id")
	private Survivor survivor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InventoryPointsEnum getDesc() {
		return desc;
	}

	public void setDesc(InventoryPointsEnum desc) {
		this.desc = desc;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Survivor getSurvivor() {
		return survivor;
	}

	public void setSurvivor(Survivor survivor) {
		this.survivor = survivor;
	}
}