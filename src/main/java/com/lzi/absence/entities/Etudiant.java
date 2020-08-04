package com.lzi.absence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Etudiant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long CNE;
	private String nom;
	private String prenom;
	@ManyToOne
	private Classe classe;
	
}
