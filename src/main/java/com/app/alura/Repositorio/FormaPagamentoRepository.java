package com.app.alura.Repositorio;

import java.util.*;

import com.app.alura.Modelo.FormaPagamento;;;

public interface FormaPagamentoRepository {

           public FormaPagamento salvar (FormaPagamento forma_Pagamento);
           public List<FormaPagamento> listaPagamentos ();
           public FormaPagamento buscarPagamento(Long id);
           public void apagarPagamento (Long id);
}
