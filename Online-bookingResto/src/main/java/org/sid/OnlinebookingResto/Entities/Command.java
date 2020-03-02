package org.sid.OnlinebookingResto.Entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Command {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
	@Min(1)
   private int quantity;
	@ManyToOne
   private Costumer costumer;
    @OneToOne(fetch = FetchType.LAZY)
   private Menu menu;
    @ManyToOne
   private Purchase purchase;
}
