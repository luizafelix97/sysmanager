package Sysmanager.Sysmanager;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner ler = new Scanner(System.in);
    	
    	Funcoes funcoes = new Funcoes( );
    	
        System.out.println( "SYSMANAGER" );
        
        int Op = -1;
        
        while( Op != 0 )
        {
        	System.out.println( "ESOLHA UMA DAS OPÇÕES" );
        	System.out.println( "1 - MAIOR NUMERO PRIMO ENTRE ELES" );
        	System.out.println( "2 - CRIPTOGRAFIA" );
        	System.out.println( "3 - FIBONACCI" );
        	System.out.println( "0 - SAIR" );
        	
        	Op = ler.nextInt( );
        	
        	switch( Op ) {
        		case 1:
        			System.out.println( "Digite 1º Valor: " );
        			
        			int valor1 = ler.nextInt( );
        			
        			System.out.println( "Digite 2º Valor: " );
        			
        			int valor2 = ler.nextInt( );
        			
        			System.out.println( "RESULTADO: " + funcoes.maiorPrimoEntreEles( valor1, valor2 ) );
        			
        			break;
        		case 2:
        			ler.nextLine( );
        			
        			System.out.println( "Digite o texto: " );
        			
        			String texto = ler.nextLine( );
        			
        			System.out.println( "RESULTADO: " + funcoes.criptografaOuDescriptografaTexto( texto, 1 ) );
        			
        			break;
        		case 3:
        			System.out.println( "Quantidade de iterações: " );
        			
        			int qtIteracoes = ler.nextInt( );
        			
        			funcoes.Fibonacci( qtIteracoes );
        			
        			break;
        		case 0:
        			System.out.println( "FIM" );
        			break;
        }
       }   	
    }
}
