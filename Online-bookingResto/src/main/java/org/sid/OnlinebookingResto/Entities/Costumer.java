package org.sid.OnlinebookingResto.Entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Costumer {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column(nullable = false,unique = true)
	@Size(min = 3,max = 25)
	private String pseudo;
	@Email
	private String email;
	@Size(min = 3, max = 50)
	private String password;
	@OneToMany(mappedBy = "costumer")
	private Collection<Command> commands;
	@OneToMany(mappedBy = "customer")
	private Collection<Purchase> purchases;
	@OneToMany(mappedBy = "costumer")
	private Collection<Bill> bills;
}
