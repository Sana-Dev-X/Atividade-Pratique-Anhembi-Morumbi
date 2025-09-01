package services;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Usuario;

public class LoginService {

    public boolean validarLogin(String usuario, String senha) {
    
        Map<String, String> usuarios = new HashMap<>();

        String arquivo = System.getProperty("user.dir") + File.separator +  "usuarios.data"; // Caminho absoluto
        try {
            usuarios = (Map<String, String>) UsuarioService.deserializar(arquivo);
        } catch (Exception e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
            return false;
        }

        System.out.println("Usuários carregados: " + usuarios);

        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}
