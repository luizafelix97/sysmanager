package Sysmanager.Sysmanager;

public class Funcoes {

	private static String[] alfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "X", "Z" };
	
	public int maiorPrimoEntreEles( int primeiroValor, int segundoValor )
	{
		int maiorPrimo = 0;
		
		int menorValor, maiorValor;
		
		if( primeiroValor >= segundoValor )
		{
			maiorValor = primeiroValor;
			menorValor = segundoValor;
		}else 
		{
			maiorValor = segundoValor;
			menorValor = primeiroValor;
		}
		
		for( int j = maiorValor; j >= menorValor; j-- )
		{
			if( verificaSeEPrimo( j ) ) 
			{
				maiorPrimo = j;
				break;
			}
		}
		
		return maiorPrimo;
	}
	
	private Boolean verificaSeEPrimo( int valor )
	{
		Boolean primo = true;
		
		if( valor == 2 || valor == -2 )
		{
			return false; 
		}
		
		if( valor > 2 && valor % 2 == 0 )
		{
			return false; 
		}
		
		for( int i = 2; i < valor; i++ )
		{
			if( valor % i == 0 )
			{
				primo = false;
			}
		}
		
		return primo;
	}
	
	public String criptografaOuDescriptografaTexto( String texto, int Op )
	{
		String textoCriptografado = "";
		
		if(!texto.isEmpty( ) )
		{
			for( int i = 0; i < texto.length( ); i++ )
			{
				textoCriptografado += traduzCaracter( Character.toString( texto.charAt( i ) ), Op );
			}
		}	
		
		return textoCriptografado;
	}
	
	private String traduzCaracter( String caracter, int Op )
	{
		String letra = "";
		
		for( int i = 0; i < alfabeto.length; i++ )
		{
			if( ( alfabeto[i] ).equalsIgnoreCase( caracter ) && !caracter.isEmpty( ) )
			{
				if( Op == 1 )
				{
					if( i < 3  )
					{
						letra = alfabeto[ alfabeto.length + ( i - 3) ];
					}
					else 
					{
						letra = alfabeto[ i - 3 ];
					}
					
					break;
				}
				else 
				{
					int qtFaltamParaInicioDoArray = i - 3;;

					if( qtFaltamParaInicioDoArray < 0  )
					{
						letra = alfabeto[ alfabeto.length + qtFaltamParaInicioDoArray ];
					}
					else 
					{
						letra = alfabeto[ i ];
					}
					
					break;	
				}
			}
			else {
				letra = " ";
			}
		}
		
		return letra;
	}
	
	public void Fibonacci( int qtIteracoes )
	{
		System.out.println( "Sequência Fibonacci: " );
		
		for( int i = 1; i <= qtIteracoes; i++ )
		{
			System.out.println( calcularFibonacci( i ) );
		}
	}
	
	private int calcularFibonacci( int valor )
	{
		if ( valor == 0 || valor == 1 ) 
		{
			return valor;
        }else 
        {
        	return calcularFibonacci(valor - 1) + calcularFibonacci(valor - 2);
        }
    }
}
