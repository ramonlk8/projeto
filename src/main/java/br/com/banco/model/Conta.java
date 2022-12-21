package br.com.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @Column(name = "id_conta")
    private Long id;

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;


}
