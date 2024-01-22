package com.jasperreports.sprigboot.Reportes.service;

import com.jasperreports.sprigboot.Reportes.entity.Empleado;
import com.jasperreports.sprigboot.Reportes.repository.EmpleadoRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ReporteService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public String exportRport(String reporte) throws FileNotFoundException, JRException {



        List<Empleado> empleados =  empleadoRepository.findAll();
        File file = ResourceUtils.getFile("classpath:empleados.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(empleados);
        Map<String, Object> parameters =  new HashMap<>();
        parameters.put("ctreatedBy", "Java Techie");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

        if(reporte.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jasperPrint, "empleados.html");
        }

        if(reporte.equalsIgnoreCase("pdf")){
            JasperExportManager.exportReportToPdfFile(jasperPrint,"empleados.pdf");
        }

        return "Reporte Generado";
    };
}
