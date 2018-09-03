package caelum;

import java.util.Scanner;

public class TestLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String escolha, escolha1;
        ListaEnc le = new ListaEnc();

        do{
            System.out.print("1 - Inserir | 2- Buscar | 3- Mostrar lista" +
                    "\n4- Está vazia? | 5- Retirar um último elemento | 6- Remover tudo \nO que deseja? ");
            int numero = sc.nextInt();

            switch (numero){
                case 1:
                    System.out.print("Digite aqui: ");
                    escolha1 = sc.next();
                    le.inserir(escolha1);
                    break;
                case 2:
                    System.out.print("Digite aqui o que deseja buscar: ");
                    escolha1 = sc.next();
                    System.out.println("Essa palavra existe? " + le.buscar(escolha1));
                    break;
                case 3:
                    System.out.println("A lista é: " + le.toString());
                    break;
                case 4:
                    System.out.println("A lista está vazia 0-Não, 1-Sim? " + le.empty());
                    break;
                case 5:
                    le.remover();
                    break;
                case 6:
                    le.removetudo();
                    break;
                default:
                    System.out.print("Erro, tente novamente!");
            }
            System.out.print("Deseja encerrar Y/N? ");
            escolha = sc.next();
        } while (!escolha.equalsIgnoreCase("y"));
    }
}
