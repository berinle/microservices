package com.tmm.ice.product.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column
import groovy.transform.EqualsAndHashCode

@Entity
@EqualsAndHashCode( includes="id" )
class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id

	private Integer version

	@Column(unique=true)
	private String name

	@javax.persistence.OneToMany(mappedBy = "product")
	List<Insurable> insurable = new ArrayList<Insurable>()

	@javax.persistence.OneToMany(mappedBy = "product")
	List<Question> questions = new ArrayList<Question>()

}
