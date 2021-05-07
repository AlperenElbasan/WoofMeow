package com.millennial.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "pets")
public class Pet {
	@Id
	@GeneratedValue
	private Integer id;
	private String type;
	private String name;
	private Integer age;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Setter
	private Date createdAt;
}
