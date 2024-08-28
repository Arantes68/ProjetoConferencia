package projetoConferencia;


/* Classe Teste EnumConferencia */
public class TesteEnumConferencia {
     
/* Variavel de instância */	
     EnumConferenciaJovens cj;

     
/* Esse construtor inicializa a variável de instância cj 
* com o valor passado do tipo EnumConferenciaJovens */
	TesteEnumConferencia(EnumConferenciaJovens cj) {
		this.cj = cj;
	}
 
	

/* Este switch utiliza as constantes do EnumConferenciaJovens para determinar qual cronograma exibir
* com base na escolha do usuário */
	    public void cronogramaConferencia() {
	    	switch(cj) {
	    	case CULTOS:
	    		System.out.printf("\n *****OBSERVAÇÃO: SOMENTE INSCRITOS \n\n 26/07 - Sexta - 20 horas \n Tema: A compaixão transcede barreiras, [Ev.Edvaldo].\n\n\n\n *****ENTRADA GRATUITA! \n\n 27/07 - 20 horas - Sábado \n Tema: O amor ao próximo é um mandamento, [Pr.Danilo]");
	    		break;
	        case PALESTRAS:
	        	System.out.printf("\n *****OBSERVAÇÃO: SOMENTE INSCRITOS! \n\n 27/07 - Sábado - Horários: \n 11:00 - Tema: A fé se manifesta em ações [Pastor Marcos] \n\n 15:00 - Tema: A misericórdia é um Dom de Deus [Irmã Natália]");
	        	break;
	        case DINÂMICAS:
	        	System.out.printf("\n *****OBSERVAÇÃO: SOMENTE INSCRITOS! \n\n 27/07 - Sábado - [Irmã Mayara]  - Horários: \n\n 10:30 \n 14:30 \n 16:30 ");
	        	break;
	        default: 
	        	System.out.println("Não encontrado!");
	    	}
	  }
}
