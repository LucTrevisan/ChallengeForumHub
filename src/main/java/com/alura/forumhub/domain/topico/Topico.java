
package com.alura.forumhub.domain.topico;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="topicos")
public class Topico {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String titulo;
 private String mensagem;
 private LocalDateTime dataCriacao;
 private String autor;
 private String curso;
 private String status;

 public Topico(){}

 public Long getId(){ return id; }

 public void setTitulo(String titulo){ this.titulo = titulo; }
 public void setMensagem(String mensagem){ this.mensagem = mensagem; }
 public void setAutor(String autor){ this.autor = autor; }
 public void setCurso(String curso){ this.curso = curso; }
 public void setStatus(String status){ this.status = status; }
 public void setDataCriacao(LocalDateTime data){ this.dataCriacao = data; }
}
