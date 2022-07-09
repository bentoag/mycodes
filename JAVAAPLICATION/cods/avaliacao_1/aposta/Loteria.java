import java.util.ArrayList;

/*
 * Loteria.java
 *
 * Classe que executa o programa e verifica o vencedor.
 */

public class Loteria {
    private static final int QTDE_DEZENAS = 6;
    private static final int MENOR_DEZENA = 1;
    private static final int MAIOR_DEZENA = 60;

    public static void main(String[] args) {
    	
    	Jogador bento = new Jogador();
    	bento.apostar(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA);
    	
    	Sorteio  mega = new Sorteio();
    	   	
    	System.out.print("Dezenas sorteadas: ");
    	System.out.print(mega.sortear(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA));
    	
    } // fim do método main
    
} // fim da classe Loteria