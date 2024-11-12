package br.com.alura.Livros.ConsumoAPI;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
