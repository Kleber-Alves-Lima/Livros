package br.com.alura.Livros.Repository;

import br.com.alura.Livros.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findByTituloContainingIgnoreCase(String titulo);

    @Query("SELECT l FROM Livro l WHERE l.lingua = :idioma")
    List<Livro> livrosPorIdioma(@Param("idioma") String idioma);

}