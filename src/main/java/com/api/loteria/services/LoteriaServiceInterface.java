package com.api.loteria.services;

import com.api.loteria.models.LoteriaModel;
import com.api.loteria.models.Nro1LoteriaModelCount;

import java.util.List;

// NATIVE QUERY NO SPRING BOOT REQUER INTERFACE ENTRE O MODELO E A APRESENTAÇÃO
public interface LoteriaServiceInterface {
    List<Nro1LoteriaModelCount> getReportByNativeQuery();
    List<LoteriaModel> findAll();
    LoteriaModel save(LoteriaModel loteriaModel);
}
