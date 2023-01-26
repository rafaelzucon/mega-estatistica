package com.api.loteria.services;

import com.api.loteria.models.LoteriaModel;
import com.api.loteria.models.Nro1LoteriaModelCount;
import com.api.loteria.repositories.LoteriaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoteriaService implements LoteriaServiceInterface {

    final
    LoteriaRepository loteriaRepository;

    @Transactional
    public LoteriaModel save(LoteriaModel loteriaModel) {
        return loteriaRepository.save(loteriaModel);
    }

    public List<LoteriaModel> findAll() {
        return loteriaRepository.findAll();
    }

    @org.springframework.transaction.annotation.Transactional
    public List<Nro1LoteriaModelCount> getReportByNativeQuery() {
        return loteriaRepository.findGroupByReportWithNativeQuery()
                .stream()
                .map(iReport -> new Nro1LoteriaModelCount(iReport.getCountNro1(), iReport.getCont1()))
                .collect(Collectors.toList());
    }

}
