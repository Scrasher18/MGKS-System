package com.mgks.peru.controller;

import com.mgks.peru.model.Evidencia;
import com.mgks.peru.service.EvidenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/evidencias")
public class EvidenciaRestController { 

    @Autowired
    private EvidenciaService evidenciaService;

    @GetMapping
    public List<Evidencia> getAll() {
        return evidenciaService.listarTodo();
    }

    @PostMapping
    public String save(@RequestBody Evidencia nuevaEvidencia) {
        evidenciaService.guardar(nuevaEvidencia);
        return "Evidencia guardada correctamente para el DNI: " + nuevaEvidencia.getUsuarioDni();
    }
}