package com.api.loteria.repositories;

import com.api.loteria.models.LoteriaModel;
import com.api.loteria.models.Nro1LoteriaModelCountInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LoteriaRepository extends JpaRepository<LoteriaModel, UUID> {

    // UMA QUERY NATIVA É UMA REGRA DE NEGÓCIO?
    @Query(value = "select " +
            "ts.nro1 as countNro1, " +
            "count(*) as count1 " +
            "FROM tb_sorteios ts " +
            "group by ts.nro1 " +
            "order by count(*) desc;", nativeQuery = true)
    List<Nro1LoteriaModelCountInterface> findGroupByReportWithNativeQuery();
}
