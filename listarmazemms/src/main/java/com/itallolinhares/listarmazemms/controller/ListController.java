package com.itallolinhares.listarmazemms.controller;

import com.itallolinhares.listarmazemms.model.Produto;
import com.itallolinhares.listarmazemms.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class ListController {

    private final ProdutoService produtoService;

    @GetMapping("/getbyid/{id}")
    public Produto getById(@PathVariable Long id){
        Produto produto = produtoService.listProduto(id);
        if(produto != null){
            return produto;
        }
        else{
            return null;
        }
    }
}
