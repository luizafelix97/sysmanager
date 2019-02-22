package Sysmanager.Sysmanager;
import junit.framework.TestCase;

public class FuncoesTest extends TestCase{

	Funcoes funcoes = new Funcoes( );
	
	public void testCriptografaOuDescriptografaTexto( )
	{
		String entrada = "ANA";
		String saidaEsperada = "YKY";
		
		assertTrue( saidaEsperada.equalsIgnoreCase( funcoes.criptografaOuDescriptografaTexto( entrada, 1 ) ) );
	}
	
	public void testMaiorPrimoEntreEles( )
	{
		int valor1 = 20;
		int valor2 = 1;
		int valorEsperado = 19;
		
		assertTrue( valorEsperado == funcoes.maiorPrimoEntreEles( valor1, valor2 ) );
	}
	
	public void testFibonacci( )
	{
		int qtIteracoes = 10;
		
		funcoes.Fibonacci( qtIteracoes );
	}
}
