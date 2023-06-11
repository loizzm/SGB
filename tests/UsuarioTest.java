package tests;

import src.Titulo;
import src.Usuario;

import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void testCadastraUsuario(){
        Usuario usuario = new Usuario(0, "Nome", "1111", "Rua A");
        assertNull(usuario.getTituloEmprestado());
    }
    
    @Test
    public void testrequisitaLivro(){
        Usuario usuario = new Usuario(0, "Nome", "1111", "Rua A");
        Titulo titulo = new Titulo("Romance", "Livro", 7, 0);
        usuario.requisitaLivro(titulo);
        assertEquals(titulo, usuario.getTituloEmprestado());
    }
    

}
