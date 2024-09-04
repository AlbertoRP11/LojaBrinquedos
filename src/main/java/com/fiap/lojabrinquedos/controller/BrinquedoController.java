package com.fiap.lojabrinquedos.controller;

import com.fiap.lojabrinquedos.model.Brinquedo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fiap.lojabrinquedos.repository.BrinquedoRepository;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    @GetMapping
    public List<Brinquedo> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public EntityModel<Brinquedo> getById(@PathVariable Long id) {
        Brinquedo brinquedo = repository.findById(id).orElseThrow();
        EntityModel<Brinquedo> resource = EntityModel.of(brinquedo);
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass()).getAll());
        resource.add(linkTo.withRel("all-brinquedos"));
        return resource;
    }

    @PostMapping
    public Brinquedo create(@RequestBody Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> update(@PathVariable Long id, @RequestBody Brinquedo brinquedoDetails) {
        Brinquedo brinquedo = repository.findById(id).orElseThrow();
        brinquedo.setNome(brinquedoDetails.getNome());
        brinquedo.setTipo(brinquedoDetails.getTipo());
        brinquedo.setClassificacao(brinquedoDetails.getClassificacao());
        brinquedo.setTamanho(brinquedoDetails.getTamanho());
        brinquedo.setPreco(brinquedoDetails.getPreco());
        final Brinquedo updatedBrinquedo = repository.save(brinquedo);
        return ResponseEntity.ok(updatedBrinquedo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
