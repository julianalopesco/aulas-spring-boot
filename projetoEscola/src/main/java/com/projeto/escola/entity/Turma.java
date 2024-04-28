package com.escola.projeto1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.JsonBackReference;
import com.fasterxml.jackson.JsonIdentityInfo;
import com.fasterxml.jackson.JsonIgnore;
import com.fasterxml.jackson.ObjectIdGenerators;


@Entity
@Table(name = "turma") //nome da tabela no db
public class Turma {
@Id //id da entidade será gerado automaticamente 
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_turma")
private Interger idTurma;

//atributos para armazenar características das turmas
@Column(name = "horario")
private Date horarioTurma;

@Column(name = "duracao")
private Integer duracaoTurma;

// Getters e setters para os atributos da turma

}