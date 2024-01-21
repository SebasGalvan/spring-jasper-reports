package com.jasperreports.sprigboot.Reportes.repository;

import com.jasperreports.sprigboot.Reportes.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
