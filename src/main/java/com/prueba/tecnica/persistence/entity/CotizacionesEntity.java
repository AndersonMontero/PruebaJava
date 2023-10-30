package com.prueba.tecnica.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cotizaciones")
@Getter
@Setter
public class CotizacionesEntity {

    @Id
    @Column(name = "numero_cotizacion")
    private String numeroCotizacion;

    private String estado;

    @Column(name = "fecha_creacion")
    private String fechaCreacion;

    @Column(name = "vigencia_cotizacion")
    private String vigenciaCotizacion;

    private String moneda;

    @Column(name = "fecha_modificacion")
    private String fechaModificacion;

    private String naviera;

    private String mercancia;

    @Column(name = "valor_mercancia")
    private String valorMercancia;

    @Column(name = "id_ciudad_origen")
    private Integer idCiudadOrigen;

    @Column(name = "id_ciudad_destino")
    private Integer idCiudadDestino;

    @Column(name = "fecha_cierre")
    private String fechaCierre;

}
