package br.com.fernando.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // Generics que permite retornar qualquer tipo

    <T> List<T> obterLista(String json, Class<T> classe);

}
