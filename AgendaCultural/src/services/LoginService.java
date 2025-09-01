package services;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Usuario;

public class LoginService {

    public boolean validarLogin(String usuario, String senha) {
        UsuarioService usuarioService = new UsuarioService();
        Map<String, String> usuarios = new HashMap<>();

        String arquivo = "usuarios.data"; // Caminho do arquivo
        usuarios = (Map<String, String>) usuarioService.deserializar(arquivo);

        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}
