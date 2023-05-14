package main.java.com.sabrine.evaluation.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "t_Enseignant")
public class Enseignant implements Serializable {
	
	@Id
	private int idEns;
	private String nomEns;
	private String prenomEns;
	
	
	

}
