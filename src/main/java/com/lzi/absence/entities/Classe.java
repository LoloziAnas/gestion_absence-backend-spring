package com.lzi.absence.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Classe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	
	@OneToMany(mappedBy = "classe")
	private Collection<Etudiant> etudients;
}
