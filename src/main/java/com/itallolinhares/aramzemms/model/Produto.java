package com.itallolinhares.aramzemms.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idProduto;

    public String nomeProduto;

    public String descricaoProduto;

    public float precoProduto;

    public int qntdProduto;
}
