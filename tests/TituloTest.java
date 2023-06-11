package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import src.Titulo;

public class TituloTest {

    @Test
    public void testCadastraUsuario(){
        Titulo titulo = new Titulo("Romance", "Livro", 7, 0);
        titulo.setDisponivel();
        assertTrue(titulo.getDisponivel());
    }
}
