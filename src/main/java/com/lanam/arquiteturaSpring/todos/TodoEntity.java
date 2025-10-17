package com.lanam.arquiteturaSpring.todos;


import jakarta.persistence.*;

@Entity
@Table (name= "tb_todo")
public class TodoEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String descricao;

    @Column (name = "fl_concluido")
    private Boolean concluido; // Não é primitivo porque inicialmente pode ser nulo


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }
    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
