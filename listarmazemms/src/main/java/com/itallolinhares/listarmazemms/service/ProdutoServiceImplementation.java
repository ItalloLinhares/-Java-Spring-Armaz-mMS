package com.itallolinhares.listarmazemms.service;

import com.itallolinhares.listarmazemms.model.Produto;
import com.itallolinhares.listarmazemms.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImplementation implements ProdutoService{

    private final ProdutoRepository produtoRepository;

    @Override
    public Produto listProduto(Long id) {
        Produto produto = produtoRepository.findByidProduto(id);
        return produto;
    }
}