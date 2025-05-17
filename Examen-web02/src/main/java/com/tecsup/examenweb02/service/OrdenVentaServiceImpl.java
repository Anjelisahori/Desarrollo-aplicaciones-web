package com.tecsup.examenweb02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecsup.examenweb02.dao.OrdenVentaDAO;
import com.tecsup.examenweb02.modelo.OrdenVenta;
import com.tecsup.examenweb02.service.OrdenVentaService;

import java.util.List;

@Service
public class OrdenVentaServiceImpl implements OrdenVentaService {

    private final OrdenVentaDAO ordenVentaDAO;

    @Autowired
    public OrdenVentaServiceImpl(OrdenVentaDAO ordenVentaDAO) {
        this.ordenVentaDAO = ordenVentaDAO;
    }

    @Override
    public List<OrdenVenta> listar() {
        return ordenVentaDAO.listar();
    }

    @Override
    public OrdenVenta obtenerPorNroOrdenVta(String nroOrdenVta) {
        return ordenVentaDAO.buscarPorNroOrdenVta(nroOrdenVta);
    }

    @Override
    public void crear(OrdenVenta ordenVenta) {
        ordenVentaDAO.guardar(ordenVenta);
    }

    @Override
    public void actualizar(OrdenVenta ordenVenta) {
        ordenVentaDAO.actualizar(ordenVenta);
    }

    @Override
    public void eliminar(String nroOrdenVta) {
        ordenVentaDAO.eliminar(nroOrdenVta);
    }
}


