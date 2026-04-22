package com.mgks.peru;

import com.mgks.peru.model.Asistencia;
import com.mgks.peru.service.AsistenciaService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AsistenciaServiceTest {

    @Test
    public void testGuardarAsistenciaAumentaLista() { 
        AsistenciaService service = new AsistenciaService();  
        int cantidadEsperada = 3;     
        Asistencia nuevaAsistencia = new Asistencia(3, "2026-04-22", "08:30", 12345678);

        service.guardar(nuevaAsistencia);
        List<Asistencia> listaActual = service.listarTodo();
        assertEquals(cantidadEsperada, listaActual.size(), "El tamaño de la lista debería ser 3");
    }
}