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
@Table(name = "t_RespQualite")
public class RespQualite implements Serializable {
	
	@Id
	private int idResp;
	private String nomResp;
	private String prenomResp;
	private String email;
	private String mdp;
	private int tel;

	

}
