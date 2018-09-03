package caelum;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class TestLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a, c;
        ListaEnc le = new ListaEnc();


        do{
            System.out.print("1 - Inserir | 2- Buscar | 3- Mostrar lista" +
                    "\n4- Está vazia? | 5- Retirar um último elemento | 6- Remover tudo \nO que deseja? ");
            int b = sc.nextInt();

            switch (b){
                case 1:
                    System.out.print("Digite aqui: ");
                    c = sc.next();
                    le.inserir(c);
                    break;
                case 2:
                    System.out.print("Digite aqui o que deseja buscar: ");
                    c = sc.next();
                    System.out.println("Essa palavra existe? " + le.buscar(c));
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
            a = sc.next();
        } while (!a.equalsIgnoreCase("y"));
    }
}
