package com.tmm.ice.product.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

import java.util.List;

import javax.persistence.Column
import groovy.transform.EqualsAndHashCode


@Entity
@EqualsAndHashCode( includes="id" )
class Cover {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id

	@ManyToOne
	private Insurable insurable

	@OneToMany(mappedBy = "cover")
	List<Question> questions = new ArrayList<Question>()
}
