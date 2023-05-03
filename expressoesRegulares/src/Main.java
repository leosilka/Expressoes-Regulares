import br.com.projetoucs.Metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                .______       _______   _______  _______ ___   ___\s
                |   _  \\     |   ____| /  _____||   ____|\\  \\ /  /\s
                |  |_)  |    |  |__   |  |  __  |  |__    \\  V  / \s
                |      /     |   __|  |  | |_ | |   __|    >   <  \s
                |  |\\  \\----.|  |____ |  |__| | |  |____  /  .  \\ \s
                | _| `._____||_______| \\______| |_______|/__/ \\__\\\s
                                                                  \s
                """);
        Scanner leitura = new Scanner(System.in);
        Metodos cadastro = new Metodos();
        System.out.println("Informe o seu nome completo:");
        cadastro.setNome(leitura.nextLine());
        System.out.println("Informe o seu e-mail valido:");
        cadastro.setEmail(leitura.nextLine());
    }
}