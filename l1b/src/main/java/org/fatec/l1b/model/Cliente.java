package org.fatec.l1b.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

	@Column
	private String conta;
}
