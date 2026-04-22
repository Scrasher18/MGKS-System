package com.mgks.peru;

import com.mgks.peru.model.Evidencia;
import com.mgks.peru.service.EvidenciaService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EvidenciaServiceTest {

    @Test
    public void testContenidoDeEvidenciaGuardada() {
       
        EvidenciaService service = new EvidenciaService();
        int dniPrueba = 87654321;
        String descPrueba = "Verificacion de rutas de emergencia";
        
        Evidencia nuevaEvidencia = new Evidencia(3, descPrueba, "2026-04-22", dniPrueba);

       
        service.guardar(nuevaEvidencia);
        
       
        Evidencia resultado = service.listarTodo().get(2);

      
        assertEquals(dniPrueba, resultado.getUsuarioDni(), "El DNI de la evidencia  coincide");
        assertEquals(descPrueba, resultado.getDescripcion(), "La descripción de la evidencia  coincide");
    }
}