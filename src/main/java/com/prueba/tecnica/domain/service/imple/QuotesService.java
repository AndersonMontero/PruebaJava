package com.prueba.tecnica.domain.service.imple;

import com.prueba.tecnica.domain.dto.CotizacionesDto;
import com.prueba.tecnica.domain.dto.CotizacionesStatusDto;
import com.prueba.tecnica.domain.repository.IQuotesRepository;
import com.prueba.tecnica.domain.service.IQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesService implements IQuotesService {

    @Autowired
    private IQuotesRepository iQuotesRepository;

    @Override
    public List<CotizacionesDto> getListlistQuotes() throws Exception {
        try {
            List<CotizacionesDto> list = iQuotesRepository.getListlistQuotes();
            if (list.isEmpty()){
                throw new Exception("No hay datos");
            }
            return list;
        } catch (Exception e){
            throw new Exception("No se puede consultar");
        }
    }

    @Override
    public List<CotizacionesStatusDto> getListQuotesStatus() throws Exception {
        try {
            List<CotizacionesStatusDto> list = iQuotesRepository.getListQuotesStatus();
            if (list.isEmpty()){
                throw new Exception("No hay datos");
            }
            return list;
        } catch (Exception e){
            throw new Exception("No se puede consultar");
        }
    }

    @Override
    public List<CotizacionesDto> getListQuotesCountry(Integer codigoPais) throws Exception  {
        try {
            List<CotizacionesDto> list = iQuotesRepository.getListQuotesCountry(codigoPais);
            if (list.isEmpty()){
                throw new Exception("No hay datos");
            }
            return list;
        } catch (Exception e){
            throw new Exception("No se puede consultar");
        }
    }

    @Override
    public List<CotizacionesDto> getListQuotesYear(Integer year) throws Exception {
        try {
            List<CotizacionesDto> list = iQuotesRepository.getListQuotesYear(year);
            if (list.isEmpty()){
                throw new Exception("No hay datos");
            }
            return list;
        } catch (Exception e){
            throw new Exception("No se puede consultar");
        }
    }
}
