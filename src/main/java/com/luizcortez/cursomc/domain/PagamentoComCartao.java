package com.luizcortez.cursomc.domain;

import com.luizcortez.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;

    private Integer numeroDeparcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeparcelas) {
        super(id, estado, pedido);
        this.numeroDeparcelas = numeroDeparcelas;
    }

    public Integer getNumeroDeparcelas() {
        return numeroDeparcelas;
    }

    public void setNumeroDeparcelas(Integer numeroDeparcelas) {
        this.numeroDeparcelas = numeroDeparcelas;
    }
}
