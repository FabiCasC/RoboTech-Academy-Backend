package com.utp.robotech_academy.controller; // 1. ASEGÚRATE que esto coincida con tu carpeta

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/v1/proyectos")
public class ProyectoController {

    @GetMapping("/seguidor-linea")
    public ResponseEntity<String> obtenerGuiaSeguidor() {
        return ResponseEntity.ok("Bienvenido al proyecto: Robot Seguidor de Línea. Kit: Arduino, Sensores IR, Motores.");
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarSimulacion(@RequestBody String datos) {
        // Aquí irá la lógica para conectar con Firebase
        return ResponseEntity.status(HttpStatus.CREATED).body("Simulación guardada con éxito.");
    }
}