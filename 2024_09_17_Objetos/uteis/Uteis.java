package uteis;


import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;


public class Uteis {


    public static String priceWithDecimal(Double price) { // no good
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");
        return formatter.format(price);
    }

    public static String priceWithoutDecimal(Double price) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return formatter.format(price);
    }

    public static String priceToString(Double price) {
        String toShow = priceWithoutDecimal(price);
        if (toShow.indexOf(".") > 0) {
            return priceWithDecimal(price);
        } else {
            return priceWithoutDecimal(price);
        }
    }


    public static String formatMoeda1(double valor) {
        Locale ptBr = new Locale("pt", "BR");
        String valorString = NumberFormat.getCurrencyInstance(ptBr).format(valor);
        return valorString;
    }

    public static void main(String[] args) {
        Locale ptBr = new Locale("pt", "BR");
        System.out.println(NumberFormat.getCurrencyInstance(ptBr).format(1234.56));
        teste();
    }

    public static void teste() {
        String mistruReba = "aBc123!@#$%áéíóú";
        String comAcentos = "áéíóúãõâêîôû";
        String soNumeros = sohNumeros(mistruReba);
        String soLetras = sohLetra(mistruReba);
        System.out.println("soNumeros......: " + soNumeros);
        System.out.println("soLetras.......: " + soLetras);
        System.out.println("removerAcentos.: " + removerAcentos(comAcentos));
        System.out.println(formatMoeda1(randomDouble()));

    }

    public static String sohLetra(String vLetras) {
        String vletras = vLetras.replaceAll("[^aA-zZ]", "");
        return vletras;
    }

    public static String sohNumeros(String vNumeros) {
        String vnumeros = vNumeros.replaceAll("[^0-9]", "");
        return vnumeros;
    }

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static int gerarRandom() {
        Random numero = new Random();
        return numero.nextInt(99999);

    }

    public void formatDoubleQuantidade() {


    }

    public static double randomDouble() {
        Double min = 100.99;  // Set To Your Desired Min Value
        Double max = 999.99; // Set To Your Desired Max Value
        double x = (Math.random() * ((max - min) + 1)) + min;   // This Will Create A Random Number Inbetween Your Min And Max.
        double xrounded = Math.round(x * 999.6) / 777.7;   // Creates Answer To The Nearest 100 th, You Can Modify This To Change How It Rounds.
        return xrounded;    // This Will Now Print Out The Rounded, Random Number.

    }


}
