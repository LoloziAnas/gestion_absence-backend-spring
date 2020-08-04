package com.lzi.absence.entities;

import java.util.Collection;

import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Enseignant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomComplet;
	private String email;
	private String mdp;
	@OneToMany(mappedBy = "enseignant")
	private Collection<Classe> classe;
}
