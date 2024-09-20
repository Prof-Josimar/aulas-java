package view;

import model.Tv;

public class ControlarTV {

    public static void main(String[] args) {
        Tv minhaTv = new Tv();


        minhaTv.ligar();
        minhaTv.aumentarVolume(); // Aumenta para 10
        minhaTv.aumentarVolume(); // Aumenta para 20
        minhaTv.mudarCanal(5);
        minhaTv.diminuirVolume(); // Diminui para 10
        minhaTv.diminuirVolume(); // Diminui para 0
        minhaTv.desligar();
        minhaTv.setMarca("Sony");
        minhaTv.setModelo("APM2025");
        System.out.println(minhaTv.informacoes());


    }
}
