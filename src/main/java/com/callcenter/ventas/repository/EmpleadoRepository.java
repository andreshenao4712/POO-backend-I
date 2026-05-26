package com.callcenter.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.callcenter.ventas.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}