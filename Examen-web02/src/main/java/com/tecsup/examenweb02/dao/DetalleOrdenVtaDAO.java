package com.tecsup.examenweb02.dao;

import com.tecsup.examenweb02.modelo.DetalleOrdenVta;

import java.util.List;

public interface DetalleOrdenVtaDAO {

    List<DetalleOrdenVta> listarPorNroOrdenVta(String nroOrdenVta);
    DetalleOrdenVta buscarPorId(String nroOrdenVta, String codMedicamento);
    void guardar(DetalleOrdenVta detalleOrdenVta);
    void actualizar(DetalleOrdenVta detalleOrdenVta);
    void eliminar(String nroOrdenVta, String codMedicamento);
}

