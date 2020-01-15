package model;

public enum TokenType {
	 // tokens de um caractere                      
	  ESQ_PARENTESES, DIR_PARENTESES, ESQ_CHAVES, DIR_CHAVES,
	  VIRGULA, PONTO, MENOS, MAIS, PONTO_VIRGULA, BARRA, ASTERISCO, DOIS_PONTOS, 

	  // tokens de ate dois caracteres                 
	  DIFERENTE,                                
	  IGUAL, MENOR_IGUAL,                              
	  MAIOR_QUE, MAIOR_IQUAL,                          
	  MENOR_QUE, ATRIBUICAO,                              

	  // literais                                     
	  IDENTIFICADOR, CADEIA, REAL, INTEIRO, CARACTERE, VETOR,                      

	  // palavras-chave                                   
	  E,  OU, NAO, 
	  FALSO,VERDADEIRO,
	  SE, ENTAO, CASO, SENAO,
	  FACA, ENQUANTO, PARA, DE, ATE, PASSO,   
	  ESCREVER, LER,
	  VARIAVEIS, INICIO, FIM, 
	  
	  TIPO_INTEIRO, TIPO_REAL, TIPO_LOGICO, TIPO_CADEIA,
	  TIPO_CARACTERE, TIPO_VETOR,

	  EOF // FIM DO ARQUIVO                                  
}