package com.prueba.tecnica.domain.repository;

import com.prueba.tecnica.domain.dto.CotizacionesDto;
import com.prueba.tecnica.domain.dto.CotizacionesStatusDto;

import java.util.List;

public interface IQuotesRepository {

    List<CotizacionesDto> getListlistQuotes();

    List<CotizacionesStatusDto> getListQuotesStatus();

    List<CotizacionesDto> getListQuotesCountry(Integer codigoPais);

    List<CotizacionesDto> getListQuotesYear(Integer year);

}
