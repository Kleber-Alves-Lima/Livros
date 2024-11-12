package br.com.alura.Livros.Model;

import jakarta.persistence.*;

@Entity
@Table(name="livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String titulo;

    private int downloads;
    private String lingua;

    // Relacionamento Muitos-para-Um (muitos livros para um autor)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id") // Indica a coluna da tabela que faz a relação
    private Autor autor;  // Um livro tem um autor

    public Livro() {}

    // Getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    // Métodos para acessar o autor (um autor por livro)
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "--------------------- LIVRO ---------------------\n" +
               // "id=" + id +
                "Título              : " + titulo +  "\n" +
                "Autor               : " + autor +  "\n"  +
                "idioma              : " + lingua +  "\n" +
                "Número de downloads : " + downloads +"\n"+
                "--------------------------------------------------\n" ;
    }
}
