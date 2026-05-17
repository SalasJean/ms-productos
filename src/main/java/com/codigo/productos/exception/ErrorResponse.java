package com.codigo.productos.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private String mensaje;
    private String detalle;
    private LocalDateTime fecha;

    public ErrorResponse() {
    }

    public ErrorResponse(String mensaje, String detalle, LocalDateTime fecha) {
        this.mensaje = mensaje;
        this.detalle = detalle;
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
