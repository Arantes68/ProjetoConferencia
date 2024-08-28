package projetoConferencia;
import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;


/* TesteEnumConferencia: Um novo objeto da classe TesteEnumConferencia é criado com o tópico inserido
*pelo usuário e o método cronogramaConferencia() é chamado para exibir a programação correspondente.*/



/* Classe Teste Conferencia */
public class TesteConferencia {

	public static void main(String[] args) {

/* Objetos Instanciados */		
	   Date hoje = new Date();
       Scanner sc = new Scanner(System.in);
       
/* Atributos/ Constantes */		
       String nome;
       boolean continuar = false;
       
     System.out.println();
     System.out.println(); 
  	 System.out.print("Por gentileza, pode digitar seu nome: ");
  	 nome = sc.nextLine();
  	 nome = nome.toUpperCase();
  	 
  	 System.out.println();
	 System.out.println("----------------------------------------------------------------------");
     System.out.printf("Acesso em: ");
	 Locale.setDefault(new Locale("pt", "Brazil"));
     String Hoje = DateFormat.getDateTimeInstance().format(hoje);
     System.out.println(Hoje);
     System.out.println(); 
     System.out.println(); 
  	 System.out.println("SEJA BEM VINDO! "+ nome);
  	 
  	 
/* Executa repetidamente, até que o usuário pare a consulta */       
  do {
     System.out.println(); 
	 System.out.println();
     System.out.println(); 
	 System.out.println("----------------------------------------------------------------------");
	 System.out.println("\n IGREJA NOVO ALVORECER \n CONFERÊNCIA DOS JOVENS 2024");
	 System.out.println(); 
     System.out.println("----------------------------------------------------------------------");
	 System.out.println();
     System.out.println("\n MENU: \n [1] CULTOS \n [2] PALESTRAS \n [3] DINÂMICAS");  
     System.out.println();
     System.out.println();
     System.out.println("----------------------------------------------------------------------");
     System.out.print("\n \n Digite um número correspondente à opção desejada: ");
     int opcao = sc.nextInt();
     
/* Variavel de instância */
     EnumConferenciaJovens eventosEnum;
     
     
/* Este switch é responsável por converter a opção numérica escolhida pelo usuário
* em uma constante do EnumConferenciaJovens*/	     
     switch(opcao) {
     case 1:
         eventosEnum = EnumConferenciaJovens.CULTOS;
         break;
     case 2:
         eventosEnum = EnumConferenciaJovens.PALESTRAS;
         break;
     case 3:
         eventosEnum = EnumConferenciaJovens.DINÂMICAS;
         break;
     default:
         System.out.println("Opção inválida! Escolha um número de 1 a 3.");
         continue; // Retorna ao início do loop para solicitar nova entrada
 }

        
     
     System.out.println();
     System.out.println();
    
     System.out.println("----------------------------------------------------------------------");

/* Objeto Classe TesteEnumConferencia */  
    TesteEnumConferencia tec = new TesteEnumConferencia(eventosEnum);
    tec.cronogramaConferencia();
    
	 System.out.println();
   	 System.out.println();
     continuar = verificarNovaConsulta();
     
  } while (continuar);
  
}

	
/* O Método pergunta se o usuário deseja continuar a consulta ou não */	
	public static boolean verificarNovaConsulta() {
   	 Scanner sc = new Scanner(System.in);
   	 
     System.out.println();
     System.out.println();
     
     System.out.println("----------------------------------------------------------------------");
 	    	  
   	 System.out.print("Deseja realizar uma nova consulta (S ou N)? ");
   	 return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
}
