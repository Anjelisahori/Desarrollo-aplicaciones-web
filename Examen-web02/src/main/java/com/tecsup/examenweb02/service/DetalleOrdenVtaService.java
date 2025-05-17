package com.tecsup.examenweb02.service;

import com.tecsup.examenweb02.modelo.DetalleOrdenVta;

import java.util.List;

public interface DetalleOrdenVtaService {

    List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta);
    DetalleOrdenVta obtenerPorId(String nroOrdenVta, String codMedicamento);
    void crear(DetalleOrdenVta detalleOrdenVta);
    void actualizar(DetalleOrdenVta detalleOrdenVta);
    void eliminar(String nroOrdenVta, String codMedicamento);
}