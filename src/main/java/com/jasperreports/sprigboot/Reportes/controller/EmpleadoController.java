package com.jasperreports.sprigboot.Reportes.controller;

import com.jasperreports.sprigboot.Reportes.entity.Empleado;
import com.jasperreports.sprigboot.Reportes.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;


    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return empleadoService.getALl();
    };

}
