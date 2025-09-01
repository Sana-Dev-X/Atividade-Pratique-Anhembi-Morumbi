package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import model.Usuario;

public class UsuarioService {

    public static Map<String, String> deserializar(String arquivo) {
       Map<String, String> usuarios = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            
            while ((linha = br.readLine()) != null) {
                // Ignora linhas vazias ou comentários
                if (linha.trim().isEmpty() || linha.startsWith("#")) {
                    continue;
                }
                
                // Divide a linha no separador (assumindo ":" como separador)
                String[] partes = linha.split(":", 2);
                
                if (partes.length == 2) {
                    String usuario = partes[0].trim();
                    String senha = partes[1].trim();
                    usuarios.put(usuario, senha);
                }
            }
            
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
        
        return usuarios;
    }

}
