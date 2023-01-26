package com.api.loteria.controllers;

import com.api.loteria.dtos.LoteriaDto;
import com.api.loteria.models.LoteriaModel;
import com.api.loteria.models.Nro1LoteriaModelCount;
import com.api.loteria.services.LoteriaServiceInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path ="/mega", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RequiredArgsConstructor
public class LoteriaController {

    private final LoteriaServiceInterface loteriaServiceInterface;

    @PostMapping("/incluir")
    public ResponseEntity<Object> saveLoteria(@RequestBody @Valid LoteriaDto loteriaDto){

        var loteriaModel = new LoteriaModel();
        BeanUtils.copyProperties(loteriaDto, loteriaModel);
        loteriaModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(loteriaServiceInterface.save(loteriaModel));
    }

    @GetMapping("/resultados")
    public ResponseEntity<List<LoteriaModel>> getAllLoteria(){
        return ResponseEntity.status(HttpStatus.OK).body(loteriaServiceInterface.findAll());
    }

    @GetMapping("/resultadoQuery")
    public ResponseEntity<List<Nro1LoteriaModelCount>> getQuery(){
        List<Nro1LoteriaModelCount> itens = loteriaServiceInterface.getReportByNativeQuery();
        int i=0;
        for (Nro1LoteriaModelCount item: itens) {
            i++;
            System.out.println("Item "+i+": "+item);
            System.out.println("Item "+i+": getCountNro1: "+item.getCountNro1()+" getCount1: "+item.getCount1());
        }

        System.out.println(itens.size());

        return ResponseEntity.status(HttpStatus.OK).body(loteriaServiceInterface.getReportByNativeQuery());
    }

}
