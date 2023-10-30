package com.prueba.tecnica.domain.service;

import com.prueba.tecnica.domain.dto.CotizacionesDto;
import com.prueba.tecnica.domain.dto.CotizacionesStatusDto;

import java.util.List;

public interface IQuotesService {
    List<CotizacionesDto> getListlistQuotes() throws Exception;

    List<CotizacionesStatusDto> getListQuotesStatus() throws Exception;

    List<CotizacionesDto> getListQuotesCountry(Integer codigoPais) throws Exception;

    List<CotizacionesDto> getListQuotesYear(Integer year)  throws Exception;

}
