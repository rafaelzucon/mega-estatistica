package com.api.loteria.services;

import com.api.loteria.models.LoteriaModel;
import com.api.loteria.models.Nro1LoteriaModelCount;

import java.util.List;

public interface LoteriaServiceInterface {
    List<Nro1LoteriaModelCount> getReportByNativeQuery();

    List<LoteriaModel> findAll();

    LoteriaModel save(LoteriaModel loteriaModel);
}
