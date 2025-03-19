package br.com.fernando.TabelaFipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // Generics que permite retornar qualquer tipo
}
