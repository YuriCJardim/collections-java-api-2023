package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntevaloAnos(Integer anoIncial, Integer anoFinal) {
        List<Livro> livrosPorIntevaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoIncial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntevaloAnos.add(l);
                }
            }
            return livrosPorIntevaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro pesquisarPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    pesquisarPorTitulo = l;
                    break;
                }
            }
            return pesquisarPorTitulo;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        //Criando uma instância do catálogo de livros
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        //Adicionando livros ao catálogo

        catalogoLivro.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivro.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivro.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivro.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2010);
        catalogoLivro.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);


        System.out.println(catalogoLivro.pesquisarPorAutor("Peter Jandl Junior"));
        System.out.println();
        System.out.println(catalogoLivro.pesquisarPorIntevaloAnos(2020, 2022));

        System.out.println();
        System.out.println(catalogoLivro.pesquisarPorTitulo("O Codificador Limpo"));
    }


}
