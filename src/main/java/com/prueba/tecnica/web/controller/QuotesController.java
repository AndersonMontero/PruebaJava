package com.prueba.tecnica.web.controller;


import com.prueba.tecnica.domain.dto.CotizacionesDto;
import com.prueba.tecnica.domain.dto.CotizacionesStatusDto;
import com.prueba.tecnica.domain.service.IQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Quotes")
public class QuotesController {

    @Autowired
    private IQuotesService iQuotesService;

    @GetMapping("/listQuotes")
    public ResponseEntity<List<CotizacionesDto>> getListQuotes () throws Exception {

        try {
            List<CotizacionesDto> list = iQuotesService.getListlistQuotes();
            return ResponseEntity.ok(list);
        }catch (Exception e){
            throw e;
        }

    }

    @GetMapping("/listQuotesStatus")
    public ResponseEntity<List<CotizacionesStatusDto>> getListQuotesStatus () throws Exception {

        try {
            List<CotizacionesStatusDto> list = iQuotesService.getListQuotesStatus();
            return ResponseEntity.ok(list);
        }catch (Exception e){
            throw e;
        }

    }

    @GetMapping("/listQuotesCountry")
    public ResponseEntity<List<CotizacionesDto>> getListQuotesCountry
            (@RequestParam(value = "codigoPais", defaultValue = "") Integer codigoPais )
            throws Exception {

        try {
            List<CotizacionesDto> list = iQuotesService.getListQuotesCountry(codigoPais);
            return ResponseEntity.ok(list);
        }catch (Exception e){
            throw e;
        }

    }

    @GetMapping("/listQuotesYear")
    public ResponseEntity<List<CotizacionesDto>> getListQuotesYear
            (@RequestParam(value = "Year", defaultValue = "") Integer Year )
            throws Exception {

        try {
            List<CotizacionesDto> list = iQuotesService.getListQuotesYear(Year);
            return ResponseEntity.ok(list);
        }catch (Exception e){
            throw e;
        }

    }

}
