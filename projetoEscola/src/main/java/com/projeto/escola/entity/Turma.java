package com.projeto.escola.entity;

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
@Table(name = "turma")
public class Turma {

}
