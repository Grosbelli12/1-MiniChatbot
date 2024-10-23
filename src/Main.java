import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MiniChatbot miniChatbot = new MiniChatbot();
        String fala = miniChatbot.dizerOla();

        System.out.println(fala);

        System.out.print("Usuário: ");

        String ajuda = scanner.next();

        String TudoBem = miniChatbot.comoEstou();

        String Nome = miniChatbot.MeuNome();

        String PossoAjudar = miniChatbot.ajudar();

        String erro = miniChatbot.naoEntendiaPergunta();


        if (ajuda.contains("oi") || ajuda.contains("Olá")) {
            System.out.println("MiniChatbot: " + PossoAjudar);
        } else {
            System.out.println(erro);
        }

        System.out.print("Usuário: ");
        String EstaBem = scanner.next();

        if (EstaBem.contains("Como você está?")) {
            System.out.println("MiniChatbot: " + TudoBem);
        } else {
            System.out.println(erro);
        }

        System.out.print("Usuário: ");
        String nome = scanner.next();

        if (nome.contains("Qual é o seu nome?")) {
            System.out.println("MiniChatbot: " + Nome);
        } else {
            System.out.println(erro);
        }

    }
}