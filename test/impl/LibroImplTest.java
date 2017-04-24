package impl;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.ILibro;
import impl.LibroImpl;
import model.Autor;
import model.Categoria;
import model.Editorial;
import model.Idioma;
import model.Libro;

public class LibroImplTest {

	@Test
	public void testAgregar() {
		
		
	    ILibro libroDAO= new LibroImpl();
		
	    
		Libro libro= new  Libro();
		
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		
		editorial.setIdEditorial(2);
		autor.setIdAutor(1);
		idioma.setIdIdioma(1);
		categoria.setIdCategoria(4);
		
		libro.setTitulo("jadfjkladjf");
		//libro.setIdLibro(1);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);	
		
		
		
		assertEquals(true, libroDAO.agregar(libro));
		
	}

}
