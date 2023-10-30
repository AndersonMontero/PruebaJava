package com.prueba.tecnica.persistence;

import com.prueba.tecnica.domain.dto.CotizacionesDto;
import com.prueba.tecnica.domain.dto.CotizacionesStatusDto;
import com.prueba.tecnica.domain.repository.IQuotesRepository;
import com.prueba.tecnica.persistence.crud.QuotesCrudRepository;
import com.prueba.tecnica.persistence.entity.CotizacionesEntity;
import com.prueba.tecnica.persistence.mapper.QuotesMapper;
import com.prueba.tecnica.persistence.projection.ICotizacionesStatusProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuotesPersistence implements IQuotesRepository {

    @Autowired
    QuotesCrudRepository quotesCrudRepository;

    @Autowired
    QuotesMapper quotesMapper;

    @Override
    public List<CotizacionesDto> getListlistQuotes() {
        return quotesMapper.toCotizacionesDto((List<CotizacionesEntity>) quotesCrudRepository.findAll());
    }

    @Override
    public List<CotizacionesStatusDto> getListQuotesStatus() {
        List<ICotizacionesStatusProjection> projection = quotesCrudRepository.getListQuotesStatus();
        return quotesMapper.toCotizacionesStatusDto(projection);
    }

    @Override
    public List<CotizacionesDto> getListQuotesCountry(Integer codigoPais) {
        List<CotizacionesEntity> entityList = quotesCrudRepository.getListQuotesCountry(codigoPais);
        return quotesMapper.togetListQuotesCountry(entityList);
    }

    @Override
    public List<CotizacionesDto> getListQuotesYear(Integer year) {
        List<CotizacionesEntity> entityList = quotesCrudRepository.getListQuotesYear(year);
        return quotesMapper.togetListQuotesCountry(entityList);
    }

}
