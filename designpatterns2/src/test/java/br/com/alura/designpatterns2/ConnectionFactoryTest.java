package br.com.alura.designpatterns2;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.designpatterns2.factory.ConnectionFactory;

public class ConnectionFactoryTest {
	
	
	@Test
	public void testaQueRetornaConexao() {
		
		Assert.assertNotNull(new ConnectionFactory().getConnection());
		
	}

}
