/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab02
 */
public class Mavenproject1 {

 public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("1984", "George Orwell", "123");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "456");

        Usuario usuario1 = new Usuario("João", 1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.registrarUsuario(usuario1);

        System.out.println(biblioteca.buscarLivro("1984"));

        Livro livroEncontrado = biblioteca.getLivroPorTitulo("1984");
        if (livroEncontrado != null) {
            usuario1.emprestarLivro(livroEncontrado);
        }

        usuario1.devolverLivro(livroEncontrado);
    }
}
