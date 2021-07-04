/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.api.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import spring.api.model.Fornecedor;

/**
 *
 * @author dilaz
 */
public interface FornecedorRepository  extends CrudRepository<Fornecedor, Integer>{
    List <Fornecedor> findByEmpresaContaining(String empresa);
    
}
