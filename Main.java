import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 0 PEDRA
        // 1 PAPEL
        // 2 TESOURA

        Random meuRandom = new Random();
        int jogadaA = meuRandom.nextInt(3);
        int jogadaB = meuRandom.nextInt(3);

        switch (jogadaA){
            case 0:
                System.out.println("A - Pedra");break;
            case 1:
                System.out.println("A - Papel");break;
            case 2:
                System.out.println("A - Tesoura");break;
        }
        switch (jogadaB){
            case 0:
                System.out.println("B - Pedra");break;
            case 1:
                System.out.println("B - Papel");break;
            case 2:
                System.out.println("B - Tesoura");break;
        }

        if (jogadaA==jogadaB){
            System.out.println("Empate!");
        }else if ((jogadaA==1 && jogadaB==0) || (jogadaA==0 && jogadaB==2)){
            System.out.println("Jogador A ganhou!");
        }else {
            System.out.println("Jogador B ganhou!");
        }

    }

}