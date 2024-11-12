package br.com.alura.Livros.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro (

    @JsonAlias("title") String titulo,

    @JsonAlias("authors") List<DadosAutor> autores, // Agora é uma lista de autores

    @JsonAlias("languages") List<String> idiomas, // Agora é uma lista de idiomas

    @JsonAlias("download_count") int downloads

) {
    @Override
    public String toString() {
        String nomesAutores = autores.stream()
                .map(DadosAutor::name)
                .collect(Collectors.joining(", "));
        return  "--------------------- LIVRO ---------------------\n" +
                "Título              : " + titulo + "\n" +
                "Autor               : " +  nomesAutores +"\n" +
                "idioma              : " +String.join(", ", idiomas) +"\n" +
                "Número de downloads : " + downloads +"\n" +
                "--------------------------------------------------";

    }

    public List<String> getIdiomasComNome() {
        Map<String, String> idiomaMap = Map.of(
                "pt", "Portuguese",
                "en", "English",
                "es", "Spanish"
                // Adicione outros idiomas conforme necessário
        );

        return idiomas.stream()
                .map(idiomaMap::get)
                .toList(); // Retorna a lista de nomes dos idiomas
    }
}