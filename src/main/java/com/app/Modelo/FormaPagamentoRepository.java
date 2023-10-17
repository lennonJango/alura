package com.app.Modelo;

import java.util.*;;;

public interface FormaPagamentoRepository {

           public FormaPagamento salvar (FormaPagamento forma_Pagamento);
           public List<FormaPagamento> listaPagamentos ();
           public FormaPagamento buscarPagamento(Long id);
           public void apagarPagamento (Long id);
}
