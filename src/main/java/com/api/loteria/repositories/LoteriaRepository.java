package com.api.loteria.repositories;

import com.api.loteria.models.LoteriaModel;
import com.api.loteria.models.Nro1LoteriaModelCount;
import com.api.loteria.models.Nro1LoteriaModelCountInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LoteriaRepository extends JpaRepository<LoteriaModel, UUID> {
//    @Query(value = "select new com.api.loteria.models.Nro1LoteriaModelCount(ts.nro1, count(ts.nro1)) FROM tb_sorteios ts group by ts.nro1")
//    List<Nro1LoteriaModelCount> findGroupByReportWithJPQL();

    @Query(value = "select ts.nro1 as countNro1, count(ts.nro1) as count1 FROM tb_sorteios ts group by ts.nro1 order by count(ts.nro1) desc", nativeQuery = true)
    List<Nro1LoteriaModelCountInterface> findGroupByReportWithNativeQuery();
}
