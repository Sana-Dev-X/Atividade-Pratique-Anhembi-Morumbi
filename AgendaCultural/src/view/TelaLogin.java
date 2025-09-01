package view;

import java.util.Scanner;

import services.LoginService;

public class TelaLogin {

    public void setVisible(boolean b) {
        
        String tela = """
        ========================================
        Login
        ========================================
        Usuário:
        ========================================
                """;
        System.out.println(tela);

        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        System.out.println("Usuário digitado: " + usuario);
        
        tela = """
        ========================================
        Senha:
        ========================================
                """;
        System.out.println(tela);
        String senha = scan.nextLine();
        
        LoginService loginService = new LoginService();

        if(loginService.validarLogin(usuario, senha)){
            System.out.println("Login realizado com sucesso!");
            TelaEventos telaEventos = new TelaEventos();
            telaEventos.setVisible(true);
        } else {
            System.out.println("Usuário ou senha inválidos! Tente novamente.");
        }
    
    }

}
