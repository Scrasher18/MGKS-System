package com.mgks.peru;

import com.mgks.peru.service.UsuarioService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioServiceTest {

    @Test
    public void testEliminarUsuarioExistente() {
        UsuarioService service = new UsuarioService();
        
        
        boolean resultado = service.eliminar("12345678");
        
        assertTrue(resultado, "Debería devolver true al eliminar un usuario que existe");
        assertEquals(1, service.listarTodo().size(), "La lista debería tener solo 1 usuario ahora");
    }

    @Test
    public void testEliminarUsuarioNoExistente() {
        UsuarioService service = new UsuarioService();
        
        
        boolean resultado = service.eliminar("00000000");
        
        assertFalse(resultado, "Debería devolver false si el DNI no existe");
    }
}