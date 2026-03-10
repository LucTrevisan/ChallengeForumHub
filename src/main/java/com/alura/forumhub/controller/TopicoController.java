
package com.alura.forumhub.controller;

import com.alura.forumhub.domain.topico.Topico;
import com.alura.forumhub.dto.DadosCadastroTopico;
import com.alura.forumhub.repository.TopicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

 @Autowired
 private TopicoRepository repository;

 @PostMapping
 @Transactional
 public void cadastrar(@RequestBody DadosCadastroTopico dados){

  Topico topico = new Topico();

  topico.setTitulo(dados.titulo());
  topico.setMensagem(dados.mensagem());
  topico.setAutor(dados.autor());
  topico.setCurso(dados.curso());
  topico.setDataCriacao(LocalDateTime.now());
  topico.setStatus("ABERTO");

  repository.save(topico);
 }

 @GetMapping
 public List<Topico> listar(){
  return repository.findAll();
 }

 @GetMapping("/{id}")
 public Topico detalhar(@PathVariable Long id){
  return repository.getReferenceById(id);
 }

 @DeleteMapping("/{id}")
 @Transactional
 public void deletar(@PathVariable Long id){
  repository.deleteById(id);
 }

}
