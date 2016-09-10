package com.github.pinheiroo27.agenda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteItem {
	@Test
	public void testaItem(){
		Usuario u = new Usuario("Anderson", "anderson.pinheiro@ufrpe.br");
		Item i = new Item(u, "novo item", "descrição novo item");
		assertEquals(u.getNome(), i.getDono().getNome());
		
	}
}
