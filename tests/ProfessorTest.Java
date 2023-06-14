package tests;

import src.Professor;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProfessorTest {
    
    @Test
    public void testAssociaLivro(){
        Professor professor = new Professor(1, "Nome", "1111", "Rua A");
        Titulo titulo = new Titulo("Romance", "Livro", 7, 0);
	professor.associaLivro(titulo);
        assertEquals(1, professor.getLivrosAssociados().size());
	assertTrue(titulo.getDisponivel());
    }

    @Test
    public void testDesassociaLivro(){
        Professor professor = new Professor(1, "Nome", "1111", "Rua A");
        Titulo titulo = new Titulo("Romance", "Livro", 7, 0);
	professor.associaLivro(titulo);
	int qtd = professor.getLivrosAssociados().size();
	professor.desassociaLivro(titulo);
        assertEquals((qtd - 1), professor.getLivrosAssociados().size());
	assertFalse(titulo.getDisponivel());
    }
}