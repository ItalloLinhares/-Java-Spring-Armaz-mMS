package com.itallolinhares.listarmazemms.repository;

import com.itallolinhares.listarmazemms.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findByidProduto(Long id);
}
