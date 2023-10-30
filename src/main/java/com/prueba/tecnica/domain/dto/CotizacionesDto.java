package com.prueba.tecnica.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CotizacionesDto {

    private String numeroCotizacion;

    private String estado;

    private String fechaCreacion;

    private String vigenciaCotizacion;

    private String moneda;

    private String fechaModificacion;

    private String naviera;

    private String mercancia;

    private String valorMercancia;

    private Integer idCiudadOrigen;

    private Integer idCiudadDestino;

    private String fechaCierre;

}