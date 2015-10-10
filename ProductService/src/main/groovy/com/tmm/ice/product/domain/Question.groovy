package com.tmm.ice.product.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column
import javax.persistence.ManyToOne
import groovy.transform.EqualsAndHashCode


@Entity
@EqualsAndHashCode( includes="id" )
class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id

	private String text

	@ManyToOne(optional = false)
	private Product product

	@ManyToOne(optional = false)
	private Insurable insurable

	@ManyToOne(optional = false)
	private Cover cover
}
