package view;

import java.util.Scanner;

public class TelaPrincipal {

    public void setVisible(boolean b) {
        
        if(b){
            System.out.println("AGENDA CULTURAL");
            String tela = 
                "========================================\n" +
                "Bem vindo ao sistema de Agenda Cultural!\n" +
                "========================================\n" +
                "Digite a opção desejada:\n" +
                "1 - Login\n" +
                "2 - Cadastrar\n" +
                "3 - Sair\n" +
                "=====================================\n";
            //Captura a opção do usuario e valida no switch        
            String opcao = "";
            while(!opcao.equals("3")){
                System.out.println(tela);
                Scanner scan = new Scanner(System.in);
                opcao = scan.nextLine();
                
                    switch (opcao) {
                        case "1":
                            this.login();
                            break;
                        case "2":
                            this.cadastro();
                            break;
                        case "3":
                            System.out.println("Saindo...");    
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                            break;
                    }
        }
    }
 
    }

    private void cadastro() {
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }

    private void login() {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }

}
