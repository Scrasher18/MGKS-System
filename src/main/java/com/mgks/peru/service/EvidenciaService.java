package com.mgks.peru.service;

import com.mgks.peru.model.Evidencia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EvidenciaService {
    private List<Evidencia> evidencias = new ArrayList<>();
    public EvidenciaService() {
    
    evidencias.add(new Evidencia(1, "Supervicion de Materiales", "2026-04-22", 12345678));
    evidencias.add(new Evidencia(2, "Escolta de cliente", "2026-04-22", 87654321));
}
    public List<Evidencia> listarTodo() {
        return evidencias;
    }

    public void guardar(Evidencia evidencia) {
        evidencias.add(evidencia);
    }
}