package com.github.pinheiroo27.agenda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.pinheiroo27.agenda.Usuario;

public class TesteUsuario {
	@Test
	public void deveTestarNomeUsuario(){
		Usuario novoUsuario = new Usuario("Anderson", "anderson.pinheiro@ufrpe.br");
		assertEquals("Anderson", novoUsuario.getNome());		
	}
	
	@Test
	public void deveTestarEmailUsuario(){
		Usuario novoUsuario = new Usuario("Anderson", "anderson.pinheiro@ufrpe.br");
		assertEquals("anderson.pinheiro@ufrpe.br", novoUsuario.getEmail());		
	}

}
