package com.jasperreports.sprigboot.Reportes.service;

import com.jasperreports.sprigboot.Reportes.entity.Empleado;
import com.jasperreports.sprigboot.Reportes.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getALl(){
        return empleadoRepository.findAll();
    }
}
