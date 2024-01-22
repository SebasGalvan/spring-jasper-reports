package com.jasperreports.sprigboot.Reportes.controller;

import com.jasperreports.sprigboot.Reportes.entity.Empleado;
import com.jasperreports.sprigboot.Reportes.service.EmpleadoService;
import com.jasperreports.sprigboot.Reportes.service.ReporteService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private ReporteService reporteService;

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return empleadoService.getALl();
    };
@GetMapping("/{reporte}")
    public String generarReporte(@PathVariable String reporte) throws JRException, FileNotFoundException {
        return reporteService.exportRport(reporte);
    }

}
