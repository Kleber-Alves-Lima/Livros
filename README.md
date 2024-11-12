<div align="center">
  <h1 align="center">
 Biblioteca Virtual
    <br />
    <br />
    <a href="Cadeado">
      <img src="src/Assets/ImagemConversor.png" alt="Imagem de convertendo moedas"  width="300" height="200">
     </a>
  </h1>
</div>
<h1 align="center"> Introdução </h1>

- ** Sistema de Consulta e Registro de Livros**

Este projeto Biblioteca Virtual  foi desenvolvido como parte do **Challenge Literalura**,uma iniciativa da [**Alura**](https://www.alura.com.br/) em parceria com o programa [**Oracle Next Education**](https://www.oracle.com/br/education/oracle-next-education/). O sistema foi projetado para  consultar e Registrar Livros povoando seu banco dados. Caso não tenha no banco de dados do sistema o livro informado, ele busca através de API pública "https://gutendex.com , as informações do Livro e registra automaticamente no banco de dados de forma simples e intuitiva. 

O desafio proposto pelo curso de desenvolvimento de sistemas visou não apenas o domínio técnico, mas também a compreensão de conceitos fundamentais de integração entre sistemas . Este projeto reflete o comprometimento com a inovação e a excelência técnica, aplicando conhecimentos adquiridos ao longo do curso . 

<h1 align="center"> Funcionalidades </h1><br>

- *Descrição* <br>

   Este projeto é um sistema de consulta e registro de livros que permite buscar informações sobre livros e seus autores através de uma API externa, além de registrar e consultar dados 
   localmente. <br>

- *O sistema possui as seguintes funcionalidades:*<br>

   1 - Buscar Livro pelo Título: Permite buscar informações de um livro pelo título na API externa.<br>
        Caso o livro já exista no banco de dados, ele será exibido diretamente.<br>
   2 - Listar Livros Registrados: Exibe uma lista de todos os livros registrados no banco de dados.<br>
   3 - Listar Autores Registrados: Exibe todos os autores presentes no banco de dados.<br>
   4 - Listar Autores Vivos em um Determinado Ano: Informa quais autores estavam vivos em um ano específico.<br>
   5 - Listar Livros em um Determinado Idioma: Filtra livros por idioma (Português, Inglês ou Espanhol).<br>


<h3>Menu de Opções</h3>

***************************************************<br>
1  - Buscar Livro pelo título<br>
2  - Listar livros registrados<br>
3  - Listar autores registrados<br>
4  - Listar autores vivos em um determinado ano<br>
5  - Listar livros em um determinado idíoma<br>
0 - Sair<br>

***************************************************<br>

Opção .: 2<br>

--------------------- LIVRO ---------------------<br>
Título              : Emma<br>
Autor               : Austen, Jane<br>
idioma              : en<br>
Número de downloads : 5798<br>
--------------------------------------------------<br>

Opção .: 3<br>
Austen, Jane<br>
Machado de Assis<br>
Melville, Herman<br>
Kafka, Franz<br>
Homer<br>
Cervantes Saavedra, Miguel de<br>

- *Estrutura Principal*<br>
  A classe Principal gerencia o sistema, exibindo o menu de opções e interagindo com o banco de dados e a API. Ela inclui:<br><br>

  ENDERECO: URL da API para consulta de livros.<br>
  ConsumoAPI: Classe que lida com o consumo de dados da API.<br>
  ConverteDados: Classe para converter e processar dados JSON da API.<br>
  LivroRepository e AutorRepository: Interfaces para acesso e manipulação dos dados no banco.<br>




- *Requisitos*<br>
  Java: JDK 11 ou superior <br>
  Maven: Para gerenciamento de dependências<br>
  Banco de Dados: (Especifique o banco usado, ex.: MySQL, PostgreSQL)<br>
  API Gutendex: O sistema consome dados da API pública Gutendex (https://gutendex.com).<br>


<h1 align="center"> Parceiros Educacionais</h1>

Este curso é oferecido por:   
 
- <img class="imagem" src="./src/Assets/Logo Alura.png" alt="logo Alura" >          **Alura**: Reconhecida instituição de ensino em tecnologia, especializada em cursos de desenvolvimento de software e outras áreas tecnológicas.
  
- <img class="imagem" src="./src/Assets/logo one.webp"  alt="logo Alura" >  **Oracle Next Education**: Programa da Oracle que visa capacitar profissionais para o mercado de tecnologia com treinamento avançado e recursos educacionais.

Juntos, esses parceiros proporcionam um curso abrangente e atualizado, preparando os alunos para se destacarem na área de desenvolvimento e tecnologia.

<h1 align="center"> Direitos Autorais</h1>

- ©  2024 Kleber Alves de Lima. Todos os direitos reservados.

<h1 align="center"> Contato</h1>

Para dúvidas, sugestões ou parcerias, entre em contato:

- Nome........... : Kleber Alves de Lima
- E-mail........... : klebelima@hotmail.com
- Linkedin..... : https://www.linkedin.com/in/kleber-alves-desenvolvedor/
- Github........ : https://github.com/Kleber-Alves-Lima

