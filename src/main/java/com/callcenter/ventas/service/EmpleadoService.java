package com.callcenter.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callcenter.ventas.model.Empleado;
import com.callcenter.ventas.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> obtenerTodos() {
        return empleadoRepository.findAll();
    }

    public Empleado guardar(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Optional<Empleado> buscarPorId(int id) {
        return empleadoRepository.findById(id);
    }

    public void eliminar(int id) {
        empleadoRepository.deleteById(id);
    }
}