package com.prueba.tecnica.domain.dto;

import com.prueba.tecnica.persistence.projection.ICotizacionesStatusProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CotizacionesStatusDto implements ICotizacionesStatusProjection {

    private String numeroCotizacion;

    private String vigenciaCotizacion;

    private String naviera;

    private String mercancia;

    private String codigoPaisDestino;

    private String codigoCiudadDestino;

}
