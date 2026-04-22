package com.mgks.peru.service;

import com.mgks.peru.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioService() {
        
        usuarios.add(new Usuario("12345678", "Luis Perez", "luis@mgks.pe","Trabajador"));
        usuarios.add(new Usuario("87654321", "Admin MGKS", "admin@mgks.pe","Administrador"));
    }

    public List<Usuario> listarTodo() {
        return usuarios;
    }

    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean eliminar(String dni) {
        return usuarios.removeIf(u -> u.getDni().equals(dni));
    }
}