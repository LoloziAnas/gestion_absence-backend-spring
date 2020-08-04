package com.lzi.absence.entities;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Seance {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date dateSeance;
	private Date heureSeance;
	@OneToMany
	private Collection<Absence> absences;
}
