package com.prueba.tecnica.persistence.crud;

import com.prueba.tecnica.persistence.entity.CotizacionesEntity;
import com.prueba.tecnica.persistence.projection.ICotizacionesStatusProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuotesCrudRepository extends CrudRepository<CotizacionesEntity, Integer> {

    @Query(value = "",nativeQuery = true)
    List<ICotizacionesStatusProjection> getListQuotesStatus();

    @Query(value = "",nativeQuery = true)
    List<CotizacionesEntity> getListQuotesCountry(Integer codigoPais);

    @Query(value = "",nativeQuery = true)
    List<CotizacionesEntity> getListQuotesYear(Integer year);

}
