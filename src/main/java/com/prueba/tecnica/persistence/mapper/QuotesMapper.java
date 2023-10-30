package com.prueba.tecnica.persistence.mapper;

import com.prueba.tecnica.domain.dto.CotizacionesDto;
import com.prueba.tecnica.domain.dto.CotizacionesStatusDto;
import com.prueba.tecnica.persistence.entity.CotizacionesEntity;
import com.prueba.tecnica.persistence.projection.ICotizacionesStatusProjection;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuotesMapper {

    List<CotizacionesDto> toCotizacionesDto(List<CotizacionesEntity> entity);

    List<CotizacionesStatusDto> toCotizacionesStatusDto(List<ICotizacionesStatusProjection> projection);

    List<CotizacionesDto> togetListQuotesCountry(List<CotizacionesEntity> entityList);

}
