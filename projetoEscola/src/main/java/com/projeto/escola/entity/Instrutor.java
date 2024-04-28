package com.projeto.escola.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.JsonIdentityInfo;
import com.fasterxml.jackson.ObjectIdGenerators;

@Entity
@Table(name = "instrutor")
public class Instrutor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) //gera as chaves primárias

//atributos para armazenar caracteristicas do instrutor 
@Column(name = "id_instrutor")
private Integer idInstrutor;

@Column(name = "rg")
private Integer rgInstrutor;

@Column(name = "nome")
private String nomeInstrutor;

@Column(name = "nascimento")
private Date dataNascimento;

@Column(name = "titulacao")
private Integer titulacaoInstrutor;

@OneToMany(mappedBy = instrutor)
private List<Turma> turmaList;

// Getters e setters para os atributos de instrutor

}
