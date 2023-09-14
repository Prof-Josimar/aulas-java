package br.com.view;

public class OperadoresIncrementoDecremento {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        /*
        Quando declaramos esse operador antes da variável,
        o incremento é realizado antes do valor da variável
        ser lido para o processamento ao qual a instrução pertence.
        Quando declarado depois, ocorre o contrário: lê-se o valor
        da variável para processamento e só então o valor da variável é incrementado.
        Com base nisso, suponha que temos o código abaixo:
       
         */
        System.out.println("-----------------------------");
        int desafioUm = 5;
        System.out.println(desafioUm);
        System.out.println(desafioUm += ++desafioUm);

        int desafioDois = 5;
        System.out.println(desafioDois);
        System.out.println(desafioDois += desafioDois++);
        /*
        
        Quais valores serão impressos no console? 10 e 10, 10 e 11, 11 e 10 ou 11 e 11?
        A resposta é 11 e 10.

        No primeiro println(), desafioUm é incrementado antes de seu valor ser lido para
        compor a instrução de soma. Sendo assim, temos desafioUm = 5 + 6. 
        Já no segundo println(), primeiro o valor é lido, 
        resultando em desafioDois = 5 + 5. Somente após a 
        leitura desafioDois é incrementado, e depois, recebe o valor da soma,
        tendo seu valor sobrescrito com o número 10.
         */
    }
}
