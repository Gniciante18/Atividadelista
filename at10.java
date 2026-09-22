package L02;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        if (usuario.equals("admin")) {
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado");
            } else {
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Usuário não encontrado");
        }

    }
}