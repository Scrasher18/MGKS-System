package com.mgks.peru.controller;

import com.mgks.peru.model.Asistencia;
import com.mgks.peru.service.AsistenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaRestController { 

    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping
    public List<Asistencia> getAll() {
        return asistenciaService.listarTodo();
    }

    @PostMapping
    public String save(@RequestBody Asistencia nuevaAsistencia) {
        asistenciaService.guardar(nuevaAsistencia);
        return "Asistencia registrada para el DNI: " + nuevaAsistencia.getUsuarioDni();
    }
}