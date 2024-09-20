package model;

public class Tv {



    private String marca;
    private String modelo;
    private int canal = 0;
    private int volume = 0;
    private boolean ligada = false;

    // Método para ligar a TV
    public void ligar() {
        ligada = true;
        System.out.println("A TV está ligada.");
    }

    // Método para desligar a TV
    public void desligar() {
        ligada = false;
        System.out.println("A TV está desligada.");
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (ligada) {
            if (volume >= 10) {
                volume -= 10;
                System.out.println("Volume diminuído para: " + volume);
            } else {
                volume = 0; // Garante que o volume não fique negativo
                System.out.println("Volume já está no mínimo.");
            }
        } else {
            System.out.println("A TV está desligada. Ligue-a primeiro.");
        }
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (ligada) {
            if (volume <= 90) { // Garante que o volume não ultrapasse 100
                volume += 10;
                System.out.println("Volume aumentado para: " + volume);
            } else {
                volume = 100; // Garante que o volume não ultrapasse 100
                System.out.println("Volume já está no máximo.");
            }
        } else {
            System.out.println("A TV está desligada. Ligue-a primeiro.");
        }
    }

    // Método para mudar o canal
    public void mudarCanal(int novoCanal) {
        if (ligada) {
            setCanal(novoCanal);
        } else {
            System.out.println("A TV está desligada. Ligue-a primeiro.");
        }
    }

    // Método para obter o estado atual da TV
    public void estadoAtual() {
        String estado = ligada ? "ligada" : "desligada";
        System.out.println("A TV está " + estado + ". Canal: " + canal + ", Volume: " + volume);
    }

    // Setters e Getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 99) {
            this.canal = canal;
            System.out.println("Canal mudado para: " + canal);
        } else {
            System.out.println("Canal inválido. O canal deve estar entre 1 e 99.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigada() {
        return ligada;
    }
    // Método para obter informações completas da TV
    public String informacoes() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Canal: " + canal + "\n" +
                "Volume: " + volume + "\n" +
                "Estado: " + (ligada ? "Ligada" : "Desligada");
    }

}
