package tests;

import src.Biblioteca;

import static org.junit.Assert.*;
import org.junit.Test;

public class BibliotecaTest {
    
    @Test
    public void testCadastraUsuario(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarAluno("Engenharia", 1, 1, "lucas", "111", "Rua A");
        assertEquals(1, biblioteca.getListUsuarios().size());
    }
    
    @Test
    public void testCadastrarTitulo(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarTitulo("Romance", "Livro", 7, 1, 10);
        assertEquals(1, biblioteca.getExemplares().size());
    }

    @Test
    public void testAlterarEstoque(){
        Biblioteca biblioteca = new Biblioteca();
        int qtd = 10;
        biblioteca.cadastrarTitulo("Romance", "Livro", 7, 1, qtd);
        biblioteca.alterarEstoque("Livro", 5);
        assertEquals(qtd + 5, biblioteca.getExemplar("Livro"));
    }

}