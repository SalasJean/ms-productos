package com.codigo.productos.service;

import com.codigo.productos.dto.ProductoRequestDTO;
import com.codigo.productos.dto.ProductoResponseDTO;

import java.util.List;

public interface ProductoService {

    ProductoResponseDTO registrar(ProductoRequestDTO request);

    List<ProductoResponseDTO> listarTodos();

    ProductoResponseDTO buscarPorId(Long id);

    ProductoResponseDTO actualizar(Long id, ProductoRequestDTO request);

    void eliminarLogicamente(Long id);
}
