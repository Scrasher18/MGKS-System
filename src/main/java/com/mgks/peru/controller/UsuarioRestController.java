package com.mgks.peru.controller;

import com.mgks.peru.model.Usuario;
import com.mgks.peru.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/users")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll() {
       
        return usuarioService.listarTodo();
    }
    @PostMapping
    public String save(@RequestBody Usuario nuevoUsuario) {
        usuarioService.guardar(nuevoUsuario);
        return "Usuario con DNI " + nuevoUsuario.getDni() + " guardado con éxito";
    }

    @DeleteMapping("/{dni}")
    public String delete(@PathVariable String dni) {
        boolean eliminado = usuarioService.eliminar(dni);
        
        if (eliminado) {
            return "Usuario con DNI " + dni + " eliminado";
        } else {
            return "Error: No se encontró usuario con el DNI " + dni;
        }
    }
}