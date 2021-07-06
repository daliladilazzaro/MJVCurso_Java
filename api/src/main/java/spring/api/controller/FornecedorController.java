/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.api.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.api.exceptions.RegistroNaoLocalizadoException;
import spring.api.model.Fornecedor;
import spring.api.repository.FornecedorRepository;
import spring.api.service.FornecedorService;

/**
 *
 * @author dilaz
 */
@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @PostMapping()
    public void incluir(@RequestBody Fornecedor fornecedor) {
        service.incluir(fornecedor);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity find(@PathVariable("id") Integer id) {
        try {
            Fornecedor fornecedor = service.buscar(id);
            return new ResponseEntity(fornecedor, HttpStatus.OK);
        } catch (RegistroNaoLocalizadoException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
//    private FornecedorRepository repository;
//
//    @GetMapping
//    public Iterable<Fornecedor> list() {
//        return repository.findAll();
//    }
//
//    @PostMapping()
//    public void incluir(@RequestBody Fornecedor f) {
//        repository.save(f);
//    }
//
    @PutMapping
    public void alterar(@RequestBody Fornecedor f) {
         service.alterar(f);
    }
//
//    @GetMapping(value = "/filter/{empresa}")
//    public Iterable<Fornecedor> list(@PathVariable("empresa") String empresa) {
//        return repository.findByEmpresaContaining(empresa);
//    }
//
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }

//    @DeleteMapping()
//    public void deleteByParam(@RequestParam("id") Integer id, @RequestParam("empresa") String empresa) {
//        repository.deleteById(id);
//    }

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Fornecedor> bucar(@PathVariable("id") Integer id) {
//        Fornecedor opt = service.buscar(id);
//        if (opt.isPresent()) {
//            return new ResponseEntity<Fornecedor>(opt.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
    
    @GetMapping(value = "handler/{id}")
    public Fornecedor handlerFind(@PathVariable("id") Integer id) {
        Fornecedor fornecedor = service.buscar(id);
        return fornecedor;
    }
//    @GetMapping(value = "/{id}")
//    public Fornecedor buscar(@PathVariable("id") Integer id) {
//        return repository.findById(id).orElse(null);
//    }
}
