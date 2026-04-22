package com.mgks.peru.service;

import com.mgks.peru.model.Asistencia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AsistenciaService {
    private List<Asistencia> asistencias = new ArrayList<>();
    public AsistenciaService() {
    
    asistencias.add(new Asistencia(1, "2026-04-22", "08:00", 12345678));
    asistencias.add(new Asistencia(2, "2026-04-22", "08:15", 87654321));
}
    public List<Asistencia> listarTodo() {
        return asistencias;
    }

    public void guardar(Asistencia asistencia) {
        asistencias.add(asistencia);
    }
}